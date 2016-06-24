package com.example.justin.pinkroccade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilco on 25-May-16.
 */
public class DataProcessor {

    private static ArrayList<Rapportage> rapportagelist = new ArrayList<>();
    private static ArrayList<Gebruiker> gebruikerslist = new ArrayList<>();

    /**
     * Returns a list with rapportages.
     * @return rapportageList
     */
    public ArrayList<Rapportage> getRapportagelist() {
        return rapportagelist;
    }

    /**
     * Function for adding a user if needed.
     * @param gebruiker
     * @return
     */
    public boolean addGebruiker(Gebruiker gebruiker) {
        if (gebruikerslist.add(gebruiker)){
            return true;
        }
        else return false;
    }

    /**
     * Returns the array list with gebruikers.
     * @return
     */
    public ArrayList<Gebruiker> getGebruikersList() {
        return gebruikerslist;
    }

    /**
     * Function for adding rapportages to our rapportage array.
     * @param rapportage
     * @return
     */
    public boolean addRapportage(Rapportage rapportage) {
        if (rapportagelist.add(rapportage)){
            return true;
        }
        else return false;
    }

}
