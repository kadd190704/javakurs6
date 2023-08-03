package Gün39._03_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String doğumTarihi) {
        super(isim, vahsi, doğumTarihi);
    }

    @Override
    void yiyeceği() {
        System.out.println("mama ve balık yer");
    }

    @Override
    void yemekMiktarı() {
        System.out.println("100 gr yer");

    }

    @Override
    void günlükUykuSüresi() {
        System.out.println("16 saat");

    }

    @Override
    void sesi() {
        System.out.println("miyav");

    }
}
