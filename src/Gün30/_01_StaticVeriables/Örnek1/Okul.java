package Gün30._01_StaticVeriables.Örnek1;

public class Okul {
    public static void main(String[] args) {
        Öğrenci ogr1=new Öğrenci("kader","taşdemir");
        System.out.println("ogr1 = " + ogr1);


        Öğrenci.okulAd="Atatürk İlkokulu";
        System.out.println("ogr1 tekrarla = " + ogr1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

    }
}
