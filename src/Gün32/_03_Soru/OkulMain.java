package Gün32._03_Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu",3);
        do {
            System.out.println("öğrenci adı="); String ad=okuStr.nextLine();
            System.out.println("öğrenci soyad=");String soyad= okuStr.nextLine();
            System.out.println("öğrencinin yaşı=");int yaş=okuInt.nextInt();

            if (yaş<15){
                Öğrenci ogr=new Öğrenci(ad,soyad,yaş);
                yeniOkul.getÖğrencileri().add(ogr);
            }
            else{
                System.out.println("öğrenci yaşı bu okul için uygun değil");
            }


        }while (yeniOkul.getÖğrencileri().size()< yeniOkul.getKontenjan());

        System.out.println("yeniOkul.getÖğrencileri() = " + yeniOkul.getÖğrencileri());

    }



}
