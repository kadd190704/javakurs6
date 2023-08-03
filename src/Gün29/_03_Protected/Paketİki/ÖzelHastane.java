package Gün29._03_Protected.Paketİki;

import Gün29._03_Protected.PaketBir.Doktor;

public class ÖzelHastane {
    public static void main(String[] args) {

        Doktor dok1=new Doktor("Ayşe");
        dok1.hastaneAd="Özel Medicell Tıp Merkezi";

        //Doktor dok2=new Doktor();
        //default sadece kendi paketinde ulaşılabilir.
    }
}
