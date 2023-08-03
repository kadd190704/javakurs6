package Gün05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi  adı  başlangıc değeri
        int    sayı =5;

        Scanner  okuyucu=new Scanner(System.in);
        //tipi   adı      yeni bir tane okuyucu oluştur(klavyeden-konsoldan)

        System.out.print("sayı giriniz=");
        int okunan = okuyucu.nextInt();//klavyeden girilen TAM SAYI yı oku
        //rakam girilip entara basıldığında değeri alıp okunan a atıyor.

        System.out.println("okunan = " + okunan);
        System.out.println("bitti");





    }
}
