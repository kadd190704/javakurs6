package Gün18;

public class _02_Java2DArray {
    public static void main(String[] args) {

     int[]dizi=new int[10];//10 tane değer boş halde ,default 0
     int[]dizi2={2,4,3,1,5,6,7,9,8,0};//10 tane hem tanımlandı hem değer atandı

        int[][]tablo=new int[2][3];//2 satır, 3 sütun, hepsi default 0 değerine sahip

        int[][] tablo2={//2 satır, 3 sütun
                {2,3,44},//1.satır 3 elemanlı
                {45,66,5}//2. satır 3 elemanlı
        };

        for (int satır=0; satır<2; satır++){//0,1
            System.out.println(tablo2[satır][0]);//her bir satırın 0.elemanı
            System.out.println(tablo2[satır][1]);//her bir satırın 1.elemanı
            System.out.println(tablo2[satır][2]);//her bir satırın 2. elemanı

        }
        //2 forlu yöntem kesin ve hatasız
        for (int satır=0; satır<2; satır++){//0,1
          for (int sütun=0;sütun<3; sütun++)//her bir satırın sütununu yazdıran for

              System.out.print(tablo2[satır][sütun]+" ");
            System.out.println();
        }















    }
}
