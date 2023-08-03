package Gün06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

   //Girilen bir String in sadece son harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz=");
        String cümle=oku.nextLine();

        int uzunluk=cümle.length();
        char SonHarf=cümle.charAt(uzunluk-1);

        System.out.println("SonHarf = " + SonHarf);

    //2.yöntem
        System.out.println("son harf="+cümle.charAt(cümle.length()-1));









    }
}
