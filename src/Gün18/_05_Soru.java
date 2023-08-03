package Gün18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

    //2*3 lük bir diziyi random 10 a kadar sayılarla doldurunuz.
    //Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
    //var ise yerini (satır,sütun)yazdırınız.

    int[][]tablo=new int[2][3];
        // random doldurma kısmı
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j <tablo[i].length; j++) {
                tablo[i][j]=(int) (Math.random()*10);
            }
        }
        //tabloyu yazdıralım
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++)
                System.out.print(tablo[i][j] + " ");
            System.out.println();
        }
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int arananSayı= oku.nextInt();

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {

                if (tablo[i][j]==arananSayı)
                    System.out.println("satır="+i+"sütun="+j);

            }
        }






    }
}
