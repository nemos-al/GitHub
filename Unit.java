public interface Actions {
    public void movie(){}
    public void movie(){}
    public void attack(){}
    public void get_damage(){}
    public void defence(){}
    public void out(){}
}

abstract class Unit {
    String name;
    int health;
    final int Damage;

    public Unit(String name, int i, int health) {
        this.health=health;
        this.name=name;
        this.Damage=200;
    }


}
class Robot extends Unit{
    int armor;

    public Robot(String name,int health,int armor, int Damage){
        super(name,health,Damage);
        this.armor=armor;
    }

    class Robot implements Actions{
        public void move(){
            System.out.println("быстро");
        }
    }
}
class Wizzard extends Unit{
    int mana;
    final int CoolDown;

    public Wizzard(String name,int health,int mana,int Damage,int Cooldown) {
        super(name, health,Damage);
        this.mana = mana;
        this.CoolDown=30;
    }


}
class Warrior extends Unit {
    public void rush(){}
    final int CoolDown;

    public Warrior(String name, int health,int attack,int Damage,int CoolDown){
        super(name, health,Damage);
        this.CoolDown=10;


    }
}
