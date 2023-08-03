package Gün06;

import java.util.Scanner;

public class _02_Örnek {
    public static void main(String[] args) {

     //Kullanıcıdan cadde ,sokak,postakodu, ve ülke şeklinde adre
     // bilgisini alarak yazdırınız.
     //ev sahibi misiniz.

     Scanner okuStr=new Scanner(System.in);
     Scanner okuInt=new Scanner(System.in);
     Scanner okuBool=new Scanner(System.in);

        System.out.print("cadde=");
        String cadde=okuStr.nextLine();

        System.out.print("sokak=");
        String sokak=okuStr.nextLine();

        System.out.print("postaK=");
        int pk=okuInt.nextInt();

        System.out.print("ülke=");
        String ülke=okuStr.nextLine();

        System.out.print("ev sahibi mi=");
        boolean evSahibiMi=okuBool.nextBoolean();

        System.out.print("aderes=" +cadde+ sokak+ pk+ ülke+ evSahibiMi);













    }
}
