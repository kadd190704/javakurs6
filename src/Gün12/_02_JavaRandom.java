package Gün12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {

    //Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
    //kullanıcı bilirse tebrikler yazdırınız
    //5 gireresem 5 e kadar sayı üretsin, ben tahmin etmeye çalışacağım

        Scanner oku=new Scanner(System.in);
        System.out.print("sınır sayısı giriniz=");
        int sınır= oku.nextInt();

        int tutulanSay=(int)(Math.random()*sınır);//6->  0,1,2,3,4,5

        System.out.print("tahminiz=");
        int tahmin=oku.nextInt();

        if (tutulanSay==tahmin)
            System.out.println("tebrikler");
        else
            System.out.println("bilemedin = " +tutulanSay );














    }
}
