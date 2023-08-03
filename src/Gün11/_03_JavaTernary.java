package Gün11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

    //Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı=");
        int sayı= oku.nextInt();

        //normal yöntem

        if (sayı%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

        //1. kısa yöntem
        String sonucu=(sayı %2 ==0) ?"çift" :"tek"; //? if in yerine kullanılıyor, : else nin yerine kullanılıyor
        System.out.println(sonucu);

        //2. kısa yöntem
        System.out.println(((sayı %2 ==0) ?"çift" :"tek"));


    }
}
