package Gün19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArray {
    public static void main(String[] args) {

   // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2];//3 satır,2 sütun
        int tekMik=0;

        //okuma işlemi yapıldı, tablonun tüm hücreleri sayı ile dolduruldu
        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j <2 ; j++) {
                System.out.print("Sayı giriniz=");//00-01-10-11-20-21
                tablo[i][j]=oku.nextInt();

                if (tablo[i][j]%2==1)
                    tekMik++;
            }
        }
        int[]tekler=new int[tekMik];//teklerin miktarı kadar bir dizi tanımladım(yer açtım)

        //doldurma işlemi
        int teklerIndex=0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j <2; j++) {

              if (tablo[i][j]%2==1){
                  tekler[teklerIndex]=tablo[i][j];
                  teklerIndex++;
              }

            }

        }

        System.out.println(Arrays.toString(tekler));














    }
}
