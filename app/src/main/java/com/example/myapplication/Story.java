package com.example.myapplication;

public class Story {
    public Situation current;
    private Situation start;

    Story(Situation start){
        this.start=start;
    }
    public void go(Situation to_change){
        current=to_change;
    }

    public boolean idEnd(){
        if (current.direction[0]==null&&current.direction[1]==null&&current.direction[2]==null){
            return true;
        }
        else return false;
    }
}
