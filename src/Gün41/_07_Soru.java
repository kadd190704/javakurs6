package Gün41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
    //Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği başlangıç tarihine göre
    //yine kullanıcının verdiği kadar taksit yaptırarark, ödeme planını ekrana yazdırınız.

    //Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
    //Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde verilecek

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyyy");

        //Tarihi alalım
        System.out.print("Taksit Baş. Tarih (01.05.2023)=");
        String strTarih=okuStr.nextLine();
        LocalDate basTarih=LocalDate.parse(strTarih,f);

        //Toplam para miktarını alalım
        System.out.print("Taksitlendirilecek miktar=");
        int toplamPara=okuInt.nextInt();

        //Taksit Sayısı
        System.out.print("Taksit Sayısı =");
        int takSay=okuInt.nextInt();

        int taksitMik=toplamPara/takSay; //1 aya düşen ödeme

        System.out.println("****** Ödeme Planınız ******");
        for (int i = 1; i <takSay ; i++) {
            System.out.print(i);
            System.out.println(" "+basTarih.plusMonths(i-1).format(f));
            System.out.println(" "+taksitMik+" Tl");



        }























    }
}
