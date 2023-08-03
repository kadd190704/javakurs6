package Gün14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayı=0;

        do {//bu döngü en az bir kez çalışır
            System.out.println("sayı giriniz=");
            sayı= oku.nextInt();
            toplam=toplam+sayı;


        }while (sayı!=0); //şart kontrolü sonda

        System.out.println("toplam = " + toplam);





















    }
}
