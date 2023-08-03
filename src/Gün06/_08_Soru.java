package Gün06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

     //Girilen bir ad soyadı örbeğin"ismet Temur" I.T.şeklinde yazdırınız.

        Scanner oku =new Scanner(System.in);

        System.out.println("Adınız ve soyadınız=");
        String adSoyad=oku.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1);
        System.out.println(ilkHarf+" " + soyadIlkHarf+" ");

















    }
}
