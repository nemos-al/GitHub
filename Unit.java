public interface Actions {
    protected int [][] variats_to_move();
    protected void movie(int pos_x,int pos_y);
    protected int [][] variats_to_attack();
    protected void attack(int pos_x, int pos_y);
    protected void get_damage(int damage);
    protected boolean defence();
    protected void out();
    protected void level_up();
}


abstract class Unit {

    final String name;
    int health;

    final int Damage;

    public Unit(String name, int Damage, int Level, int health) {
        this.health=health;
        this.name=name;
        this.Damage=200;
    }
    public Unit implements Actions{

    }
}


class Robot extends Unit{
    int armor;

    public Robot(String name, int health, int armor, int Damage){
        super(name,health,Damage);
        this.armor=armor;
    }

    class Robot implements Actions{
        public void move(){
            System.out.println("быстро");
        }
        public void attack(){Damage}
        public void get_damage(){if (armor-Damage>=0){
            armor-=Damage;
        }
        else if (health-Damage>0){
            health-=Damage;
        }
        else System.out.println(name+" мёртв");
        }
        public void defence(){}
        public void out(){System.out.println("Имя: "+name);
            System.out.println("Здоровье: "+health);
            System.out.println("Атака: " Damage);}
    }
}


class Wizzard extends Unit{
    int mana;
    final int CoolDown;

    public Wizzard(String name, int health, int mana, int Damage, int Cooldown) {
        super(name, health,Damage);
        this.mana = mana;
        this.CoolDown=30;
    }

    class Wizzard implements Actions {
        public void move(){
            System.out.println("средне");
        }
        public void Rush(){
            int[][] attack = variants_to_attack();
            for
        }
        public void attack(){Damage}
        public void get_damage(){
            if (health-Damage>0){
            health-=Damage;
        }
        else System.out.println(name+" мёртв");
        }
        public void defence(){}
        public void out(){System.out.println("Имя: "+name);
            System.out.println("Здоровье: "+health);
            System.out.println("Атака: " Damage);}
    }

}


class Warrior extends Unit {
    public void rush(){}
    final int CoolDown;

    public Warrior(String name, int health, int attack, int Damage, int CoolDown){
        super(name, health,Damage);
        this.CoolDown=10;

        class Warrior implements Actions {
            public void move(){
                System.out.println("медленно");
            }
            public void attack(){Damage}
            public void get_damage(){
                if (health-Damage>0){
                health-=Damage;
            }
            else System.out.println(name+" мёртв");
            }
            public void defence(){}
            public void out(){System.out.println("Имя: "+name);
                System.out.println("Здоровье: "+health);
                System.out.println("Атака: " Damage);}
        }
    }
}
