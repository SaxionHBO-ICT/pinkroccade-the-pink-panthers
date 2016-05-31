package com.example.justin.pinkroccade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilco on 25-May-16.
 */
public class DataProcessor {

    private static ArrayList<Rapportage> rapportagelist = new ArrayList<>();
    private static ArrayList<Gebruiker> gebruikerslist = new ArrayList<>();

    public ArrayList<Rapportage> getRapportagelist() {
        return rapportagelist;
    }

    public ArrayList<Gebruiker> getGebruikerslist() {
        return gebruikerslist;
    }

    public boolean addGebruiker(Gebruiker gebruiker) {
        if (gebruikerslist.add(gebruiker)){
            return true;
        }
        else return false;
    }

    public boolean addRapportage(Rapportage rapportage) {
        if (rapportagelist.add(rapportage)){
            return true;
        }
        else return false;
    }
}
