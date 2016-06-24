package com.example.justin.pinkroccade;

import java.util.Date;

/**
 * Created by Justin on 18-5-2016.
 */
public class Rapportage {

    private String rapportageNaam;
    private String clientAdres;
    private String medewerkerNaam;
    private String datum;

    /**
     * Constructor for a rapportage which are shown in the looplijst.
     * @param rapportageNaam
     * @param clientAdres
     * @param tijd
     */
    public Rapportage(String rapportageNaam, String clientAdres, String tijd) {
        this.rapportageNaam = rapportageNaam;
        this.clientAdres = clientAdres;
        this.datum = tijd;
    }

    /**
     *
     * @return rapportageNaam.
     */
    public String getRapportageNaam() {
        return rapportageNaam;
    }

    /**
     *
     * @return clientAdres.
     */
    public String getClientAdres() {
        return clientAdres;
    }

    /**
     *
     * @return medewerkerNaam.
     */
    public String getMedewerkerNaam() {
        return medewerkerNaam;
    }

    /**
     *
     * @return datum.
     */
    public String getTijd() {
        return datum;
    }

}
