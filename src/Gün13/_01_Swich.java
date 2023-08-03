package Gün13;

import java.util.Locale;
import java.util.Scanner;

public class _01_Swich {
    public static void main(String[] args) {

     //Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra
     //Toplama içinT, Çıkarma için Ç, çarpma için P,Bölme için B
     //harflerini yine kullanıcıdan alararak isteğe uygun olan
     //işlemi yaptırıp sonucu yazdırınız


        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz=");
        int sayı1= oku.nextInt();

        System.out.print("2.sayıyı giriniz=");
        int sayı2= oku.nextInt();

        System.out.println("toplama için T");
        System.out.println("çıkarma için Ç");
        System.out.println("çarpma için P");
        System.out.println("bölme için B");
        System.out.println("seçiminiz=");
        String seçim= okuStr.nextLine();//Str yi okumayınca doğru çalışmadı.

        switch (seçim.toUpperCase()){
            case "T" : System.out.println("toplam = " + (sayı1+sayı2));break;
            case "Ç" : System.out.println("çıkarma = " + (sayı1-sayı2));break;
            case "P" : System.out.println("çarpma = " + (sayı1*sayı2));break;
            case "B" : System.out.println("bölme = " + (sayı1/sayı2));break;
            default: System.out.println("hatalı işlem girdiniz");
        }









    }
}
