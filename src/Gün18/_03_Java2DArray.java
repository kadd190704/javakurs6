package Gün18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _03_Java2DArray {
    public static void main(String[] args) {

     int [][]tablo={//2 satır, 3 sütun
             {2,3,44},//1.satır 3 elemanlı
             {45,66,5} //2.satur 3 elemanlı
     };
        System.out.println(Arrays.toString(tablo[0]));//0. satır tümü
        System.out.println(Arrays.toString(tablo[1]));//1. satır tümü
        System.out.println("tablo[0].leght="+tablo[0].length);//0.satırın uxunluğu
        System.out.println("tablo[1].leght="+tablo[1].length);//1. satırın uzunluğu

        System.out.println("tablo = " + tablo.length);//kaç satır var, satır uzunluğu

        for (int satır=0; satır<tablo.length; satır++){

            for (int sütun=0; sütun<tablo[satır].length; satır++)//her bir satırın sütunlarını yazdıran fo
                System.out.print(tablo[satır][sütun]+" ");

            System.out.println();
        }




















    }
}
