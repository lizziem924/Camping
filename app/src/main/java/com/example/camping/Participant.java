package com.example.camping;

public class Participant {
    //attributes
    String name;
    boolean youthOrAdult;
    //bool is true if adult and false if youth

    //constructor
    public Participant(String n, boolean ya) {
        name = n;
        youthOrAdult = ya;
    }
    //methods
    public String getName() {return name;}
    public void setName(String n) {name = n;}

    public boolean getYA() {return youthOrAdult;}
    public void setYA(boolean ya) {youthOrAdult = ya;}
}
