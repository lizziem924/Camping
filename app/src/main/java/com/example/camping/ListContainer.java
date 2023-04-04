package com.example.camping;

import java.util.ArrayList;

public class ListContainer {

    private static ArrayList<Campout> campoutList;
    public static ArrayList<Campout> getCampoutList() {
        if (campoutList == null) {
            //on first instance, it's not initialized, so do so
            campoutList = new ArrayList<Campout>();
        }
        //return the list so that every screen is using the same list
        return campoutList;
    }

    private static ArrayList<Participant> participantArrayList;
    public static ArrayList<Participant> getParticipantArrayList() {
        if (participantArrayList == null) {
            //on first instance, it's not initialized, so do so
            participantArrayList = new ArrayList<Participant>();
        }
        //return the list
        return participantArrayList;
    }
    public void emptyParticipantList() {
        if (participantArrayList == null) {
            //on first instance, it's not initialized, so do so
            participantArrayList = new ArrayList<Participant>();
        }
        else {
            //it's already initialized and it might not be empty
            for (int i = 0; i < participantArrayList.size(); i++) {
                participantArrayList.remove(i);
                i--;
            }
        }
    }
}
