package JavaÖdev_İfElse;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("3 tane sayı giriniz=");
        String sayılar=oku.nextLine();

        int birinciBoşlukIndex=sayılar.indexOf(" ");
        String strSayı1=sayılar.substring(0,birinciBoşlukIndex);
        String strSayı2=sayılar.substring(birinciBoşlukIndex+1);
        int ikinciBoşlukIndex=sayılar.indexOf(" ");
        String strSayı3=sayılar.substring(ikinciBoşlukIndex+1);

        int sayı1=Integer.parseInt(strSayı1);
        int sayı2=Integer.parseInt(strSayı2);
        int sayı3= Integer.parseInt(strSayı3);

        int toplam=(sayı1+sayı2+sayı3);
        System.out.println("toplam = " + toplam);

        int kalan=toplam%2;
        if (kalan==0)
            System.out.println("çift");

        else
            System.out.println("tek");






















    }
}
