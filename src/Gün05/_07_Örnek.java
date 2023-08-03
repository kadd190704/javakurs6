package Gün05;

import java.util.Scanner;

public class _07_Örnek {
    public static void main(String[] args) {
        // bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulnuz ve yazdırınız.
        // çevre=a+a+b+b     alan=a*b

        Scanner oku=new Scanner (System.in);
        System.out.print("uzunKenar=");
        int a=oku.nextInt();
        System.out.print("kısaKenar=");
        int b= oku.nextInt();
        //1. yöntem
        int çevre=a+b+a+b;
        int alan= a*b;
        System.out.print("alan = " + alan);
        System.out.print("çevre = " + çevre);
        //2. yöntem
        System.out.print(" çevre="+(a+b+a+b));
        System.out.print("alan="+(a*b));


    }
}
