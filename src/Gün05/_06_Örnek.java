package Gün05;

import java.util.Scanner;

public class _06_Örnek {
    public static void main(String[] args) {

     // Bir karenin  kenarını kullanıcıdan isteyip çevresini ve alanını
     //bulunuz ve yazdırınız. çevre=a+a+a+a alan=a*a

        Scanner oku= new Scanner(System.in);
        System.out.println("kenar=");
        int kenar =oku.nextInt();

        int çevre= kenar+kenar+kenar+kenar; //4*kenar yapabiliriz.
        System.out.println("çevre = " + çevre);
        
        int alan= kenar*kenar;
        System.out.println("alan = " + alan);
        















    }
}
