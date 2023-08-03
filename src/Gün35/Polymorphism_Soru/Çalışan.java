package Gün35.Polymorphism_Soru;

public class Çalışan extends Kişi{
    private String departmanı;

    public String getDepartmanı() {
        return departmanı;
    }

    public void setDepartmanı(String departmanı) {
        this.departmanı = departmanı;
    }

    public Çalışan(String ad, String soyad, String görevi, String departmanı) {
        super(ad, soyad, görevi);
        setDepartmanı(departmanı);

    }
}
