package Gün11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {

    //Math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("a değeri=");
        int a=oku.nextInt();

        System.out.println("b değeri=");
        int b = oku.nextInt();

        System.out.println(" c değeri=");
        int c= oku.nextInt();

        //a,b= enbAB    c,
        int enbAbden=Math.max(a,b);
        int enb=Math.max(enbAbden,c);
        System.out.print("enb=");

        //2. yöntem
        System.out.print(Math.max(c,Math.max(a,b)));
















    }
}
