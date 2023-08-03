package Gün11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

    //Soru: Girilen sayı 50 den büyük ise 1, değilse 0 değerini
    //ekrana yazdırınız.Ternary operatör ile yapınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir=");
        int sayı= oku.nextInt();

        //1. kısa yol
        int sonuç=(sayı>50) ? 1 : 0 ;
        System.out.println(sonuç);

        //2. kısa yol
        System.out.println((sayı>50) ? 1 : 0);

















    }
}
