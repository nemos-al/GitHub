package com.example.myapplication;

import android.widget.TextView;

public class Situation {;
    public Situation[] direction=new Situation[3];
    public String subject;
    public String text;

    public int dH;
    public int dM;
    public int dR;

    Situation (String subject, String text, int dH,int dM, int dR){
        this.subject=subject;
        this.text=text;
        this.dH=dH;
        this.dM=dM;
        this.dR=dR;
    }
    Situation (String subject, String text, int dH,int dM, int dR, Situation first_choose){
        this.subject=subject;
        this.text=text;
        this.dH=dH;
        this.dM=dM;
        this.dR=dR;
        direction[0]=first_choose;
    }
    Situation (String subject, String text, int dH,int dM, int dR,Situation first_choose,Situation second_choose){
        this.subject=subject;
        this.text=text;
        this.dH=dH;
        this.dM=dM;
        this.dR=dR;
        direction[0]=first_choose;
        direction[1]=second_choose;
    }
    Situation (String subject, String text, int dH,int dM, int dR,Situation first_choose,Situation second_choose,Situation third_choose){
        this.subject=subject;
        this.text=text;
        this.dH=dH;
        this.dM=dM;
        this.dR=dR;
        direction[0]=first_choose;
        direction[1]=second_choose;
        direction[2]=third_choose;
    }
}
