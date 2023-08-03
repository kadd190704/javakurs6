package Gün15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {

     //Kullanıcıdan 5 sayı isteyiniz
     //Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("sayı giriniz=");
            int sayı= oku.nextInt();

            if (sayı>6 && sayı<10)
             continue;//pas geç:kendinden sonra gelen komutları pas geçer
            //döngüden sonraki adıma geçer

            toplam=toplam+sayı;
            System.out.println("continue çalışmadı");


        }
        System.out.println("toplam = " + toplam);



















    }
}
