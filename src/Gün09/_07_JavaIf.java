package Gün09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

      //Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını yazdırınız.
      //VAR ve YOK şeklinde

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle giriniz=");
        String cümle=oku.nextLine();

        cümle=cümle.toLowerCase(); // bütün harfler küçük olud
        if (cümle.contains("a"))
            System.out.println("VAR");
        if (!cümle.contains("a"))
            System.out.println("YOK");

















    }
}
