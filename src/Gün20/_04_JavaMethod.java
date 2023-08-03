package Gün20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 12345 i bulmalısınız

        Scanner oku=new Scanner(System.in);

        System.out.println("Bir sayı giriniz=");
        int sayı= oku.nextInt();

        int çarpım=faktoryel(sayı);
        System.out.println("çarpım = " + çarpım);


    }
    public static int faktoryel(int sayı){

        int çarpım=1;
        for (int i = 0; i <=sayı; i++)
        çarpım=çarpım*i;//1*1-> 1*2-> 2*3-> 6*4-> 24*5->120

        return  çarpım;

    }
}
