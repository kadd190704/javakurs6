package JavaÖdevi4;

import java.util.Scanner;

public class _18_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Ad soyad giriniz=");
        String adSoyad=oku.nextLine();


        int boşlukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boşlukIndex);
        String ikinciAd=adSoyad.substring(boşlukIndex+0);
        String soyad=adSoyad.substring(boşlukIndex+boşlukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ikinciAd = " + ikinciAd);

















    }
}
