package Gün14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {

    //Kullanıcıdan * girilene kadar ekrana "program çalışıyor" yazan
    //ve * girildiğinde ise "program bitti" yazan programı yazınız.

        Scanner oku=new Scanner(System.in);
        String girilen;

        do {
            System.out.print("ifade giriniz=");
            girilen=oku.next();

            if (!girilen.equalsIgnoreCase("*"))
            System.out.println("program çalışıyor");

        }while (!girilen.equalsIgnoreCase("*"));

        System.out.println("program bitti");




















    }
}
