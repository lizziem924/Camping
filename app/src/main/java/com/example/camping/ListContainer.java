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
}
