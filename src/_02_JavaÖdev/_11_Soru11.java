package _02_JavaÖdev;

import java.util.Scanner;

public class _11_Soru11 {
    public static void main(String[] args) {
        
     //Kullanıcıdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.println("öğrenci1=");
        int öğrenci1= oku.nextInt();
        System.out.println("öğrenci2=");
        int öğrenci2= oku.nextInt();
        System.out.println("öğrenci3=");
        int öğrenci3= oku.nextInt();

        int toplam=öğrenci1+öğrenci2+öğrenci3;
        int ortalama=toplam/3;

        System.out.println("ortalama = " + ortalama);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
