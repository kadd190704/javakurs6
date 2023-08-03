package Gün11;

import java.util.Scanner;

public class _05_JavaTenary {
    public static void main(String[] args) {

     // Otopark ücretleri:
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den büyükse 20tl dir
        // kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("saat giriniz=");
        int saat= oku.nextInt();

        String ücretStr=(saat<=3) ? "10tl" : (saat<=5) ? "15tl" :"20tl";
        System.out.println("ücretStr = " + ücretStr);

        //2. yöntem
        System.out.println((saat<=3) ? "10tl" : (saat<=5) ? "15tl" :"20tl");














    }
}
