package Gün10;

import java.util.Scanner;

public class _03_MantıksalIfadeler {
    public static void main(String[] args) {

     //mantıksal ifadeler Logic statement
     //&& ve işareti (shit6)=and
     //|| veya işareti  =or

        Scanner oku=new Scanner(System.in);

        System.out.println("sayı1=");
        int sayı= oku.nextInt();

        int kalan=sayı%2;

        if (kalan==1 || kalan==-1)//1 veya -1 iken
            System.out.println("tek");
        else  //0
            System.out.println("çift");









    }
}
