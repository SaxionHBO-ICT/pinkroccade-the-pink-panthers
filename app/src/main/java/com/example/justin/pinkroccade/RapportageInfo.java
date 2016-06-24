package com.example.justin.pinkroccade;

/**
 * Created by Justin on 15-6-2016.
 */
public class RapportageInfo {

    private int handenAanBed;
    private int productiviteit;

    /**
     * Constructor for creating Rapportage Information.
     * @param handenAanBed
     * @param productiviteit
     */
    public RapportageInfo(int handenAanBed, int productiviteit) {
        this.handenAanBed = handenAanBed;
        this.productiviteit = productiviteit;

    }

    /**
     *
     * @return handenAanBed
     */
    public int getHandenAanBed() {
        return handenAanBed;
    }

    /**
     * Set the handenAanBed.
     * @param handenAanBed
     */
    public void setHandenAanBed(int handenAanBed) {
        this.handenAanBed = handenAanBed;
    }

    /**
     *
     * @return productiviteit
     */
    public int getProductiviteit() {
        return productiviteit;
    }

    /**
     * Set the productiviteit.
     * @param productiviteit
     */
    public void setProductiviteit(int productiviteit) {
        this.productiviteit = productiviteit;
    }

}
