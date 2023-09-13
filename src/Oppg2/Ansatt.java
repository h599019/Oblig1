package Oppg2;

public class Ansatt {
    private String fornavn;
    private String etternavn;
    private Kjonn kjonn;
    private String stilling;
    private int aarsloon;

    public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int aarsloon) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.stilling = stilling;
        this.aarsloon = aarsloon;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Kjonn getKjonn() {
        return kjonn;
    }

    public void setKjonn(Kjonn kjonn) {
        this.kjonn = kjonn;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public int getAarsloon() {
        return aarsloon;
    }

    public void setAarsloon(int aarsloon) {
        this.aarsloon = aarsloon;
    }

    @Override
    public String toString() {
        return "Fornavn='" + fornavn + '\'' +
                ", Etternavn='" + etternavn + '\'' +
                ", Kjonn=" + kjonn +
                ", Stilling='" + stilling + '\'' +
                ", Årslønn=" + aarsloon;
    }
}
