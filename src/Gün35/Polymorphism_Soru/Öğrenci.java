package Gün35.Polymorphism_Soru;

public class Öğrenci extends Kişi {

    private String şubesi;

    public Öğrenci(String ad, String soyad, String görevi,String şubesi) {
        super(ad, soyad, görevi);
        setŞubesi(şubesi);
    }

    public String getŞubesi() {
        return şubesi;
    }

    public void setŞubesi(String şubesi) {
        this.şubesi = şubesi;
    }
}
