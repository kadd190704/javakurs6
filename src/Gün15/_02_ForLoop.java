package Gün15;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sınır= oku.nextInt();
        int çarpım=1;

        for (int i = 1; i <=sınır ; i++) {
            System.out.print("çarpım="+çarpım+"*"+i);
            çarpım=çarpım*i;

            System.out.println("->"+çarpım);

            if (çarpım>1000){
                System.out.println("break çalıştı");
                break;
            }

        }






















    }
}
