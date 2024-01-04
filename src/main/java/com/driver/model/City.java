package com.driver.model;

public enum City {
    ;

    private String KANPUR;
   private String DELHI;
   private String  CHANDIGARH;
   private String  BANGLORE;
   private String JAIPUR;
   private String KOLKATA;
   private String  CHENNAI;

    City() {
    }

    City(String KANPUR, String DELHI, String CHANDIGARH, String BANGLORE, String JAIPUR, String KOLKATA, String CHENNAI) {
        this.KANPUR = KANPUR;
        this.DELHI = DELHI;
        this.CHANDIGARH = CHANDIGARH;
        this.BANGLORE = BANGLORE;
        this.JAIPUR = JAIPUR;
        this.KOLKATA = KOLKATA;
        this.CHENNAI = CHENNAI;
    }

    public String getKANPUR() {
        return KANPUR;
    }

    public void setKANPUR(String KANPUR) {
        this.KANPUR = KANPUR;
    }

    public String getDELHI() {
        return DELHI;
    }

    public void setDELHI(String DELHI) {
        this.DELHI = DELHI;
    }

    public String getCHANDIGARH() {
        return CHANDIGARH;
    }

    public void setCHANDIGARH(String CHANDIGARH) {
        this.CHANDIGARH = CHANDIGARH;
    }

    public String getBANGLORE() {
        return BANGLORE;
    }

    public void setBANGLORE(String BANGLORE) {
        this.BANGLORE = BANGLORE;
    }

    public String getJAIPUR() {
        return JAIPUR;
    }

    public void setJAIPUR(String JAIPUR) {
        this.JAIPUR = JAIPUR;
    }

    public String getKOLKATA() {
        return KOLKATA;
    }

    public void setKOLKATA(String KOLKATA) {
        this.KOLKATA = KOLKATA;
    }

    public String getCHENNAI() {
        return CHENNAI;
    }

    public void setCHENNAI(String CHENNAI) {
        this.CHENNAI = CHENNAI;
    }
}
