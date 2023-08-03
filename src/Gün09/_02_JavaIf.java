package Gün09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

     //Girilen bir sayının negatif mi,poztif mi olduğunu yazdırınız.
     //Sıfır ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı=");
        int sayı= oku.nextInt();

        if(sayı>0)
            System.out.println("pozitif");
        if (sayı<0)
            System.out.println("negatif");
        if (sayı==0)
            System.out.println("sıfır");




           //VERY GOOD






    }
}
