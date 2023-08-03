package Gün43;

import java.util.Scanner;

public class _04_JavaRuntimeException {
    public static void main(String[] args) {

        boolean doğruÇalıştı=true;

        do {

            try { //hata bölgesine şerit i çektik
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayı1 =");
                int sayı1 = oku.nextInt();

                System.out.print("Sayı2 =");
                int sayı2 = oku.nextInt();

                int bölüm = sayı1 / sayı2;
                System.out.println("bölüm = " + bölüm);
                doğruÇalıştı=true;
            } catch (Exception hata) {//hata olursa yakala ve aşağıdaki bölümü çalıştır
                //hata  mesalarını hata isimli Eception cinsinden değişkene attım
                System.out.println("hata oluştu");
                System.out.println("hata =" + hata.getMessage());
                System.out.println("Lütfen 2.sayıyı 0 vermeyin");
                doğruÇalıştı=false;

            }
        }while (!doğruÇalıştı); //doğru çalışmadıysa dön
    }
}
