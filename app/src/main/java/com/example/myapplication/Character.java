package com.example.myapplication;

public class Character {
    String name;
    int heath;
    int money;
    int rep;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }
    Character (String name){
        this.name=name;
        heath=100;
        money=0;
        rep=0;
    }
    public  void CharacterStat(int dH,int dM,int dR){
        heath=dH;
        money=dM;
        rep=dR;
    }

}
