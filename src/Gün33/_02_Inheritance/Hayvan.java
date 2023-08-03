package Gün33._02_Inheritance;

public class Hayvan {//super,parent,base
    private String renk;
    private int kilo;
    private String cinsi;

    public void konuştu(){
        System.out.println("ses çıkardı");
    }

    public Hayvan(String renk, int kilo, String cinsi) {
        setRenk(renk);
        setKilo(kilo);
        setCinsi(cinsi);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public String toString() {
        return "Hayvan" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'';
    }
}
