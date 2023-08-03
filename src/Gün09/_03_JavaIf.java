package Gün09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

    //Girilen iki sayıdan büyük olanın değerini ekrana yazdırınız.
    //eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı1=");
        int sayı1= oku.nextInt();
        System.out.print("sayı2=");
        int sayı2= oku.nextInt();

        if(sayı1>sayı2)
            System.out.println("sayı1 = " + sayı1);

        if (sayı2>sayı1)
            System.out.println("sayı2 = " + sayı2);

        if(sayı1==sayı2)
            System.out.println("eşit");
        else
            System.out.println("eşit değil");



         //VERY VERY GOOD
         //KEEP GOİNG LİKE THAT








    }
}
