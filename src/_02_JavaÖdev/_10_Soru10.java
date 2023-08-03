package _02_JavaÖdev;

import java.util.Scanner;

public class _10_Soru10 {
    public static void main(String[] args) {

    //Kullanıcıdan alacağınız 2 sayının 4 işlemini ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("sayı1=");
        int sayı1=oku.nextInt();
        System.out.println("sayı2=");
        int sayı2=oku.nextInt();

        int toplam=sayı1+sayı2;
        int çıkarma=sayı1-sayı2;
        int çarpma=sayı1*sayı2;
        int bölme= sayı1/sayı2;

        System.out.println("toplam = " + toplam);
        System.out.println("çıkarma = " + çıkarma);
        System.out.println("çarpma = " + çarpma);
        System.out.println("bölme = " + bölme);










    }
}
