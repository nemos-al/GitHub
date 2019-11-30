public class Quest {
    //=======персонаж=======
    public class Character {
        public int K;
        public int A;
        public int R;
        public String name;

        public Character(String name) {
            K = 1;
            A = 100;
            R = 50;
            this.name = name;
        }
    }
    //=======ситуация=======
    public static class Situation {
        Situation[] direction;
        String subject,text;
        int dK,dA,dR;
        public Situation (String subject, String text, int variants, int dk,int da,int dr) {
            this.subject=subject;
            this.text=text;
            dK=dk;
            dA=da;
            dR=dr;
            direction=new Situation[variants];
        }
    }
    // =======история=======
    public class Story {

        private Situation start_story;
        public Situation current_situation;

        Story() {
            start_story = new Situation(
                    "К вам подходит бомж",
                    "К вам подходит бомж. От него несёт выделениями и перегаром "
                            + "Сделать ему приятно\n"
                            + "Сделать ему больно\n"
                            + "Попытаться уйти",
                    3, 0, 0, +10);
            start_story.direction[0] = new Situation(
                    "Вы дали денег",
                    "Вы дали бомжу денег. Он представился Олегом "
                            + "Сделать ему приятно\n"
                            + "Сделать ему больно\n"
                            + "Попытаться уйти",
                    3, 0, -10, +999);
            start_story.direction[0] = new Situation(
                    "Вы пожали бомжу руку",
                    "Вы пожали бомжу руку.\n "
                            + "Он станцевал лезгинкую\n"
                            + "Вам стало приятно",
                    0, +3, 0, +1000);
            start_story.direction[1] = new Situation(
                    "Вы вывернули бомжу руку",
                    "Вы вывернули бомжу руку.\n "
                            + "Вы-мудак\n"
                            + "Бомж оказался местным Джеки-чаном\n"
                            + "Вы в больнице",
                    0, -99999, -99999, -99999);
            start_story.direction[2] = new Situation(
                    "Вы вы ушли",
                    "Вы просто так взяли и ушли\n "
                            + "Бомж достал из урны водяру и начал бухать\n"
                            + "Вы - плохой человек\n",
                    0, -20, 0, -1000);


            start_story.direction[0] = new Situation(
                    "совещание, босс доволен",
                    "Сегодня будет совещание, меня неожиданно вызвали,"
                            + "есть сведения что \n босс доволен сегодняшней сделкой.",
                    0, 1, 100, 0);
            start_story.direction[2] = new Situation(
                    "мой первый лояльный клиент",
                    "Мой первый клиент доволен скоростью и качеством "
                            + "моей работы. Сейчас мне звонил лично \nдиректор компании,  сообщил что скоро состоится еще более крупная сделка"
                            + " и он хотел, чтобы по ней работал именно я!", 0, 0,
                    50, 1);
            current_situation = start_story;
        }

        public void go(int num) {
            if (num <= current_situation.direction.length)
                current_situation = current_situation.direction[num - 1];
            else
                System.out.println("Вы можете выбирать из "
                        + current_situation.direction.length + " вариантов");
        }

        public boolean isEnd() {
            return current_situation.direction.length == 0;
        }
    }

}