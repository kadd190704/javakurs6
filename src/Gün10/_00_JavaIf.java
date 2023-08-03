package Gün10;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {

     //Kullanıcıdan 2 kez gireceği şifrenin aynı olduğunu
     //AYNI veya DEĞİL şeklinde cevaplayınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("şifreniz =");
        String şifre= oku.nextLine();

        System.out.println("şifreniz tekrar=");
        String şifreTekrar= oku.nextLine();

        //içerik karşılaştırıcı EQUALS kullanılmalı.

        if (şifre.equals(şifreTekrar))
            System.out.println("AYNI");


        if (!şifre.equals(şifreTekrar))
            System.out.println("DEĞİL");

















    }
}
