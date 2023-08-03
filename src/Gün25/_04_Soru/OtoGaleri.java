package Gün25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Araba>galeri=new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            Araba a=new Araba();

            System.out.print("Araba no=");
            a.arabaNo=okuInt.nextInt();
            System.out.print("Araba Markası=");
            a.marka=okuStr.nextLine();
            System.out.print("Araba üretim yılı=");
            a.üretimYılı=okuInt.nextInt();

            galeri.add(a);

        }
        arabaYazdır(galeri);
        üretimOrtalamasıYazdır(galeri);
    }
    public static void arabaYazdır(ArrayList<Araba>galeri){
        for (Araba a:galeri)
            System.out.println(a.arabaNo+" "+a.marka+" "+a.üretimYılı);

    }
    public static void üretimOrtalamasıYazdır(ArrayList<Araba>galeri){
        int toplamYıl=0;
        for (Araba a:galeri)
            toplamYıl=toplamYıl+a.üretimYılı;

        int ort=toplamYıl/galeri.size();
        System.out.println("ort = " + ort);
    }
}
