package JavaÖdevi4;

import java.util.Scanner;

public class _17_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Ad, ikinci ad ve soyad giriniz=");
        String adSoyad= oku.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int boşlukIndex=adSoyad.indexOf(" ");
        char ikinciAd=adSoyad.charAt(boşlukIndex+1);
        int kelime= adSoyad.lastIndexOf(" ");
        char soyad=adSoyad.charAt(boşlukIndex+boşlukIndex+0);
        System.out.println("baş harfler = "+ilkHarf+ikinciAd+soyad );







    }
}
