package Gün09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

      //Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
      //tek veya çift şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir=");
        int sayı= oku.nextInt();

        if(sayı%2==1)
            System.out.println("sayı tek");

        if(sayı%2==0)
            System.out.println("sayı çift");











    }
}
