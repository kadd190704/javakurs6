package Gün32._03_Soru;

import java.util.ArrayList;
import java.util.Objects;

public class Okul {
    private String okulAd;
    private int kontenjan;

    ArrayList<Öğrenci>öğrencileri=new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        this.okulAd = okulAd;
        this.kontenjan = kontenjan;
    }
    public String getOkulAd(){
        return okulAd;
    }
    public void setOkulAd(String okulAd){
        this.okulAd=okulAd;
    }
    public int getKontenjan(){
        return kontenjan;
    }
    public void setKontenjan(int kontenjan){
        this.kontenjan=kontenjan;
    }
    public ArrayList<Öğrenci>getÖğrencileri(){
        return öğrencileri;
    }
    public void setÖğrencileri(ArrayList<Öğrenci>öğrencileri){
        this.öğrencileri=öğrencileri;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", öğrencileri=" + öğrencileri +
                '}';
    }
}
