package Gün05;

import java.util.Scanner;

public class _09_Örnek {
    public static void main(String[] args) {

        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku= new Scanner(System.in);

        System.out.print("kilonuz(kg)=");
        double kilo= oku.nextDouble();

        System.out.print("boyunuz(m)=");
        double boy= oku.nextDouble();

        double vücutKI= kilo/(boy*boy);
        System.out.println("kilonuz ve boyunuz="+ boy+" "+kilo);
        System.out.print("vücutKI = " +vücutKI);











    }
}
