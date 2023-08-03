package classÖdevi;

import java.util.ArrayList;
import java.util.Scanner;

public class Öğretmen {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Öğrenci>notDefteri=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Öğrenci ogr=new Öğrenci();

            System.out.println("Tam ad girin: ");
            ogr.tamAd=okuStr.nextLine();
            System.out.println("Okul no girin:" );
            ogr.okulNo=okuInt.nextInt();
            System.out.println("Ders notu girin:");
            ogr.notu=okuInt.nextInt();
            notDefteri.add(ogr);
        }
        öğrenciYazdır(notDefteri);
        notOrtalaması(notDefteri);

    }
    public static void öğrenciYazdır(ArrayList<Öğrenci>notDefteri){
        for (Öğrenci ogr:notDefteri)
            System.out.println(ogr.tamAd+" "+ogr.okulNo+" "+ogr.notu);
    }
    public static void notOrtalaması(ArrayList<Öğrenci>notDefteri){
        int toplamNot=0;
        for (Öğrenci ogr:notDefteri)
            toplamNot=toplamNot+ ogr.notu;
        int ort=toplamNot/notDefteri.size();
        System.out.println("ort = " + ort);

    }


}
