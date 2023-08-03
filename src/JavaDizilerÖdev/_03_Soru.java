package JavaDizilerÖdev;

public class _03_Soru {
    public static void main(String[] args) {

     //   İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //   Array in elemanlarının toplamını yazdır.
        //    Cevap 220 olmalı.


       int[]array={25,30,30,35,100};

      int toplam=0;
        for (int i = 0; i <array.length; i++) {
            toplam=toplam+array[i];

        }
        System.out.println("toplam = " + toplam);










    }
}
