package JavaÖdev_İfStatement;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

    //Kullanıcıdan vize ve final notunu alınız. ort=0.4*vize+0.6*
    //final olarak bularak, 50 ve yukaruda ise geçtiniz
    //altında ise kaldınız yazdırınz

        Scanner oku=new Scanner(System.in);
        System.out.println("vize notu=");
        int vizeNot= oku.nextInt();

        System.out.println("final notu=");
        int finalNot= oku.nextInt();

        int ort=(int)(0.4*vizeNot+0.6*finalNot);

        if (ort>=50)
            System.out.println("geçtiniz");
        else
            System.out.println("kaldınız");

















    }
}
