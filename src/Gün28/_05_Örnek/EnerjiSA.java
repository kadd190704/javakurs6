package Gün28._05_Örnek;

public class EnerjiSA {
    public static void main(String[] args) {
        Müşteri mus1=new Müşteri("Kader");

        mus1.elektrikHesabı.tüketimEkle(50);
        mus1.elektrikHesabı.tüketimEkle(60);
        mus1.elektrikHesabı.tüketimEkle(70);

        System.out.println("toplam tüketim="+mus1.elektrikHesabı.toplamTüketim);

        mus1.elektrikHesabı.faturaYaz();

    }
}
