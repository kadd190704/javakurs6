package Gün10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {

    //Girilen sayı pozitif ve tek ise, ekrana uygun sayı girildi
    //değilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı gir=");
        int sayı= oku.nextInt();

        if (sayı>0 && sayı%2==1)
            System.out.println("ekrana uygun sayı girildi");
        else
            System.out.println("uygun sayı girilmedi");
















    }
}
