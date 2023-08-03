package Gün39._03_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String doğumTarihi) {
        super(isim, vahsi, doğumTarihi);
    }

    @Override
    void yiyeceği() {
        System.out.println("et yer");
    }

    @Override
    void yemekMiktarı() {
        System.out.println("1 kilogram");

    }

    @Override
    void günlükUykuSüresi() {
        System.out.println("8 saat");

    }

    @Override
    void sesi() {
        System.out.println("ciyak fiuu");

    }
}
