package Gün19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // bir sayının tekmi çift mi olduğunu yazdırınız.
   int sayı=55;

   if (sayı%2==0)
       System.out.println("çift");
   else
       System.out.println("tek");

    /*******************************/

    tekMiÇiftMiYaz(55);
    tekMiÇiftMiYaz(60);
    /******************************/
    okuTekMiÇiftMi();
    }
    public static void tekMiÇiftMiYaz(int sayı){
        if (sayı%2==0)
            System.out.println("m:çift");
        else
            System.out.println("m:tek");
    }

    public static void okuTekMiÇiftMi() {


        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı giriniz=");
        int sayı = oku.nextInt();

        tekMiÇiftMiYaz(sayı);

        //      if (sayi%2 == 0)
       //    System.out.println("m:çift");
        // else
       //     System.out.println("m:tek");







    }
}









