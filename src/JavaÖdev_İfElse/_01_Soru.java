package JavaÖdev_İfElse;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        //yan yana aralarında bir boşlukla girilen 2 int sayının
        //birbirine eşit olup olmadığını bulunuz
        //45  67

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayıları aralarında bir boşluk olacak şekilde giriniz=");
        String sayılar=oku.nextLine();

        int boşlukIndex=sayılar.indexOf(" ");
        String strSayı1=sayılar.substring(0,boşlukIndex);
        String strSayı2=sayılar.substring(boşlukIndex+1);

        int sayı1=Integer.parseInt(strSayı1);
        int sayı2=Integer.parseInt(strSayı2);

        if (sayı1==sayı2)
            System.out.println("eşit");
        else
            System.out.println("eşit değil");



























    }
}
