package Gün07;

import java.util.Scanner;

public class _07_Örnek1 {
    public static void main(String[] args) {

     //Tek seferde girilen bir ad soyadın (tam ad) adını ve soyadını ayırıp,
     //ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Adınız ve Soyadınız=");
        String adSoyad=oku.nextLine();//Kader Taşdemir

        //0-boşuluğun indexine kadar dese:ad
        //boşluğun indekxi+1 den sonuna kadar desem:
        int boşlukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boşlukIndex);
        String soyad=adSoyad.substring(boşlukIndex+1);


        System.out.println("ad = " +ad );
        System.out.println("soyad = " +soyad );


      //güzel örnek









    }
}
