package Gün11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {

      //Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //olduğunu Ternary operatör ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı=");
        int sayı= oku.nextInt();
        // ? böyle ise ,  : değilse (else)
        System.out.println(sayı==0 ? "sıfır" : sayı>0 ? "pozitif" :"negatif");










    }
}
