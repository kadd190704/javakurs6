package Gün10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

    //Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
    //küçük ise kaldınız yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("notu giriniz=");
        int oggrNot= oku.nextInt();

        //1. yöntem bilgisayar boş yere çalışıyor
        if (oggrNot>=50)
            System.out.println("geçtiniz");
        if (oggrNot<50)
            System.out.println("kaldınız");

        //2.yöntem olması gereken
        if (oggrNot>=50)
            System.out.println("geçtiniz");
        else// değilse demek  (oggrNot<50)ise
            System.out.println("kaldınız");













    }
}
