package Gün25._03_Örnek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Ogrenci>öğrenciler=new ArrayList<>();

        for (int i = 0; i <3; i++) {
            Ogrenci ogr=new Ogrenci();

            System.out.print("öğrenci adı=");
            ogr.adı= okuStr.nextLine();
            System.out.print("öğrenci soyadı=");
            ogr.soyadı=okuStr.nextLine();
            System.out.print("öğrenci sınıfı=");
            ogr.sınıfı=okuInt.nextInt();
            System.out.print("öğrenci adresi=");
            ogr.adres=okuStr.nextLine();

            öğrenciler.add(ogr);
        }
        for (Ogrenci o:öğrenciler){
            System.out.println("o.adı = " + o.adı);
            System.out.println("o.soyadı = " + o.soyadı);
            System.out.println("o.sınıfı = " + o.sınıfı);
            System.out.println("o.adres = " + o.adres);
        }


    }
}
