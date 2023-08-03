package Gün09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {

      //girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı oku=");
        int sayı=oku.nextInt();

        int kalan=sayı%2;// 1 ise tektir
        boolean tekMi=(kalan==1);
        System.out.println("tekMi = " + tekMi);

        //2. yol
        //System.out.println("tekm mi = "+(kalan==1) );




















    }
}
