package Gün12;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {

   //Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
   //Toplama için T, Çıkarma için Ç, Çarpma için P,Bölme için B
   // harflerini yine kullanıcıdan alarak isteğe uygunn olan
   // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("1.Sayı=");
        int sayı1=oku.nextInt();

        System.out.print("2.Sayı=");
        int sayı2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.println("Seçiminiz=");
        String seçim=okuStr.next();

      //merdivenli if,ladder if
        if (seçim.equalsIgnoreCase("T"))
            System.out.println("toplam = " +(sayı1+sayı2) );

         else
             if (seçim.equalsIgnoreCase("Ç"))
                 System.out.println("çıkarma = " +(sayı1-sayı2) );

             else 
                 if (seçim.equalsIgnoreCase("P"))
                     System.out.println("Çarpam = " +(sayı1*sayı2) );
             
                 else
                     if (seçim.equalsIgnoreCase("B"))
                         System.out.println("Bölme="+(sayı1/sayı2));

                     else
                         System.out.println("Hatalı giriş");
             
             
             
             
             
             
             
             
             
             
             

    }
}
