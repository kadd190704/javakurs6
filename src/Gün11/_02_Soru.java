package Gün11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

    //Otopark ücretleri:
    //3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den büyükse 20tl dir
    //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Aracın kalacağı saat=");
        int saat= oku.nextInt();

     //   eğer 3 ve 3 ten nkşüçükse 10 tl yaz
       //         değilse {
        //    eğer 5 den küçükse 15 tl
          //  değilse 20tl

        //    }

        if (saat<=3)
            System.out.println("10 tl");
        else {
            if (saat <= 5)
                System.out.println("15 tl");

            else
                System.out.println("20 tl");
        }














    }
}
