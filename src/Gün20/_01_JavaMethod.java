package Gün20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {

// Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i <dizi.length; i++) {
            System.out.println("Sayı giriniz=");
            dizi[i]=oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        enBüyükYaz(dizi);
        enKüçükYaz(dizi);
        ortalamaYaz(dizi);

    }
    public static void enBüyükYaz(int[]dizi){
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("en büyük="+dizi[dizi.length-1]);//sondaki sayıyı verir

    }
    public static void enKüçükYaz(int[]dizi){
        Arrays.sort(dizi);
        System.out.println("en küçük="+dizi[0]);//sondakini verir
    }

    public static void ortalamaYaz(int[]dizi){

     double toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        double ort=toplam/ dizi.length;
        System.out.println("ort = " + ort);









    }
}
