package Gün18;

public class _04_Soru {
    public static void main(String[] args) {

// 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][]tablo=new int[2][3];// 2 ve 3 lük bir tablo

        //tabloyu random 100 e kadar sayılarla doldurunuz
        for (int satır = 0; satır < tablo.length ; satır++) {

            for (int sütun = 0; sütun <tablo[satır].length ; sütun++)
                tablo[satır][sütun]=(int)(Math.random()*100);

        }
         //tabloyu yazdıralım
        for (int satır = 0; satır < tablo.length; satır++) {
            for (int sütun = 0; sütun <tablo[satır].length ; sütun++)
                System.out.print(tablo[satır][sütun]+" ");

                System.out.println();
        }

       //tabloyu yazdıralım
        int tekSayıMik=0;
        for (int satır=0; satır< tablo.length; satır++){
            for (int sütun=0;sütun<tablo[satır].length; sütun++){
                if(tablo[satır][sütun]%2==1)
                    tekSayıMik++;
            }
        }

        System.out.println("tekSayıMik = " + tekSayıMik);

















    }
}
