package com.example.camping;

import java.util.List;

public class Campout {
    //attributes
    String name;
    List<Participant> participantList;
    int campsiteFee;
    int mileageFromCamp;
    int milesPerGallon;
    double gasPrice;

    //constructor
    public Campout(String n, List<Participant> pl, int fee, int mileCamp, int mpg, double gas) {
        name = n;
        participantList = pl;
        campsiteFee = fee;
        mileageFromCamp = mileCamp;
        milesPerGallon = mpg;
        gasPrice = gas;
    }

    //methods

    //getters
    public String getName() {return name;}
    public List<Participant> getParticipantList() {return participantList;}
    public int getCampsiteFee() {return campsiteFee;}
    public int getMileageFromCamp() {return mileageFromCamp;}
    public int getMilesPerGallon() {return milesPerGallon;}
    public double getGasPrice() {return gasPrice;}

    //setters
    public void setName(String n) {name = n;}
    public void setParticipantList(List<Participant> pl) {participantList = pl;}
    public void setCampsiteFee(int fee) {campsiteFee = fee;}
    public void setMileageFromCamp(int mileCamp) {mileageFromCamp = mileCamp;}
    public void setMilesPerGallon(int mpg) {milesPerGallon = mpg;}
    public void setGasPrice(double gas) {gasPrice = gas;}

    //need a method to add a participant to the list
    public void addParticipant(Participant p) {
        participantList.add(p);
    }
    public void removeParticipant(Participant p) {
        participantList.remove(p);
    }
}
