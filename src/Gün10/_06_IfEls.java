package Gün10;

import java.util.Scanner;

public class _06_IfEls {
    public static void main(String[] args) {

     //Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
     //kurallar= 1.en az 8 karakter olmalı
     //2. içinde pass kelimesi olmamalı
     //3. en fazla 12 karakter olmalı

        Scanner oku=new Scanner(System.in);
        System.out.println("şifre gir=");
        String şifre= oku.nextLine();

        if (şifre.length()>=8 && şifre.length()<=12 &&
                !şifre.toLowerCase().contains("pass"))
            System.out.println("kurallara uygun");
        else
            System.out.println("kurallara uygun değil");
















    }
}
