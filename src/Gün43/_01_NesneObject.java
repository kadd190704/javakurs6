package Gün43;

import java.util.ArrayList;

public class _01_NesneObject {
    public static void main(String[] args) {
        //her şey bir nesne(object) mi?
        // Kişi ogr1=new Student();
        //Object ogr1=new Student();

        ArrayList<Object>genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(3.5);
        genelList.add(true);

        System.out.println("genelList = " + genelList);

        // her tip eklenebiliyor, çünkü bütün tipler Object türetildiği için

        double oran=10/3.0;
        System.out.println("oran = " + oran);

        //System.out.printf("formatı", değişkenleri);

        System.out.printf("%f",oran); // %f :% değişkenin geleceği yer
                                      // f : double, fload kesirli

        System.out.println();
        System.out.printf("sonuç= %4.1f\n",oran);
        //4: toplamda 4 hane kullanılacak nokta dahil
        //1: noktadan sonra kaç hane kullanılacak

        System.out.printf("sonuç=%-4.1f\n",oran);// - sola dayalı

        int sayı=5;
        System.out.printf("sonuç=%-5.2f ,tamSayı=%d",oran,sayı);
        // f: double veya float
        // d: ddecimal: tam sayı
        // s: string değişkenler












    }
}
