package Gün10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

     //Girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı gir=");
        int sayı= oku.nextInt();

        int kalan=sayı%2; //çiftler(0,2,4,6,-2,-4,)

        if (kalan==0)
            System.out.println("çift");

        else//0 değilken yani 1 veya -1 durumunda
            System.out.println("tek");
























    }
}
