package Gün14;

import java.util.Scanner;

public class _01_DoWhile {
    public static void main(String[] args) {

        //kullanıcı 0 değeri girene kadar
        //girdiği sayıların toplamını bulunuz.


        Scanner oku=new Scanner(System.in);
        int toplam=0;

        System.out.println("sayı giriniz=");
        int sayı= oku.nextInt();
        toplam=toplam+sayı;

        while (sayı!=0){
            System.out.println("sayı giriniz=");
            sayı=oku.nextInt();
            toplam=toplam+sayı;

        }
        System.out.println("toplam = " + toplam); 















    }
}
