package Gün29._03_Protected.PaketBir;

public class SağlıkBakanlığı {
    public static void main(String[] args) {
        Doktor dok1=new Doktor();
        dok1.hastaneAd="Numunu Hastanesi";
        dok1.adı="Kader";
        dok1.bölümü="Nöroloji";
        //dok1.sicilNo private

        Doktor dok2=new Doktor("mehmet");
    }
}
