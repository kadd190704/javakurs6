package Gün22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

      int sayı=5;  //tek bir rakam saklayabilen bir değişken
      int []dizi=new int[20]; //20 adet sayı saklayabilen bir değişken,
                             //uzunluk sabit, her bir hücresinde bir sayı var
     int[][]tablo=new int[20][10];//20 satır 10 sütunu var, 200 sayı saklar
                                 //uzunluk sabit, her bir hücrede bir dizi var
                                 //her bir sattırda 10 sayı olan bir dizi

        ArrayList<Integer>liste=new ArrayList<>();//her bir satır(hücresi)
                                                 //Intager bir sayı saklayabilecek, atıldıkça
                                                 //Intager in listi, uzunluk değişken

        ArrayList<Integer>matNotları=new ArrayList<>();//tek boyut
        ArrayList<Integer>fizNotları=new ArrayList<>();//tek boyut
        ArrayList<Integer>kimNotları=new ArrayList<>();//tek boyut

        matNotları.add(50);
        matNotları.add(70);
        matNotları.add(80);

        fizNotları.add(50);
        fizNotları.add(60);

        kimNotları.add(50);
        kimNotları.add(70);
        kimNotları.add(80);
        kimNotları.add(90);

        //ArrayList lerin ArrayList i
        ArrayList<ArrayList<Integer> >tümNotlar=new ArrayList<>();
        tümNotlar.add(matNotları);
        tümNotlar.add(fizNotları);
        tümNotlar.add(kimNotları);

        tümNotlar.get(0);//matNotlarınız
        tümNotlar.get(0).get(0);//ilk mat notu

        System.out.println("tümNotlar.get(0) = " + tümNotlar.get(0));//matNotları
        System.out.println("tümNotlar.get(0) = " + tümNotlar.get(1));//fizNotları
        System.out.println("tümNotlar.get(2) = " + tümNotlar.get(2));//kimNotları

        //ilk mat notu
        System.out.println("tümNotlar.get(0).get(0) = " + tümNotlar.get(0).get(0));


        /****************satır yazdırma*********/

        for (int i = 0; i <tümNotlar.size() ; i++) {
            System.out.println("tümNotlar = " + tümNotlar.get(i));
        }
        /******************************satır sütun yazdırma***********/
        for (int i = 0; i < tümNotlar.size(); i++) {
            for (int j = 0; j < tümNotlar.get(i).size(); j++) {
                System.out.println("tek tek notlar = " + tümNotlar.get(i).get(j));
            }
        }








    }
}
