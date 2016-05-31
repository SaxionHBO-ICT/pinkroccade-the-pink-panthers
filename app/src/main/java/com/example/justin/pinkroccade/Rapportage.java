package com.example.justin.pinkroccade;

import java.util.Date;

/**
 * Created by Justin on 18-5-2016.
 */
public class Rapportage {

    private String rapportageNaam;
    private int aantMedewerkers;
    private String clientAdres;
    private int medewerkerProductiviteit;
    private String medewerkerNaam;
    private Date datum;

    public Rapportage(String rapportageNaam, String clientAdres, Date datum) {
        this.rapportageNaam = rapportageNaam;
        this.clientAdres = clientAdres;
        this.datum = datum;
    }

    public String getRapportageNaam() {
        return rapportageNaam;
    }

    public int getAantMedewerkers() {
        return aantMedewerkers;
    }

    public String getClientAdres() {
        return clientAdres;
    }

    public int getMedewerkerProductiviteit() {
        return medewerkerProductiviteit;
    }

    public String getMedewerkerNaam() {
        return medewerkerNaam;
    }

    public Date getDatum() {
        return datum;
    }
}
