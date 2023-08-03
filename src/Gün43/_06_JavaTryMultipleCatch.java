package Gün43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

       try { //hata bölgesine şerit i çektik
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayı1 =");
            int sayı1 = oku.nextInt();

            System.out.print("Sayı2 =");
            int sayı2 = oku.nextInt();

            int bölüm = sayı1 / sayı2;
            System.out.println("bölüm = " + bölüm);

         //   String kelime="";  Genel hataya düşmesi için yapıldı
         //   kelime.charAt(3);


       }
       catch (ArithmeticException ex){ //belirli  bir hata :case
           System.out.println("Sıfıra bölme hatası oluştu");
       }
       catch (InputMismatchException ex){ //belirli bir hata : case
           System.out.println("Lütfen sayı giriniz");
       }
       catch (Exception ex){ //genel hata swich deki default gibi
           System.out.println("Beklenmeyen hata oluştu");
       }

        System.out.println("Program bitti");

    } //bugün
}