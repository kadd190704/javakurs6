package Gün30._04_Soru;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        int gün=0;
        int saat=0;
        int dk=0;

        Scanner oku=new Scanner(System.in);
        System.out.println("Gün =" ); gün= oku.nextInt();
        System.out.println("Saat=");  saat= oku.nextInt();
        System.out.println("dakika="); dk= oku.nextInt();

        int toplamSaniye=
                gün
                * Sabitler.BirGündekiSaatSayısı
                * Sabitler.BirSaattekiDakikaSayısı
                * Sabitler.BirDakikadakiSaniyeSayısı
                +
               saat
               * Sabitler.BirSaattekiDakikaSayısı
               * Sabitler.BirDakikadakiSaniyeSayısı
               +
               dk
               *Sabitler.BirDakikadakiSaniyeSayısı;

        System.out.println("toplamSaniye = " + toplamSaniye);


        //2.yöntem
        System.out.println("toplamSaniye = " + Sabitler.hesapla(gün,saat,dk));


    }
}
