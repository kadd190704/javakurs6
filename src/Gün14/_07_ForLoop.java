package Gün14;

public class _07_ForLoop {
    public static void main(String[] args) {

   //0 dan 100 e kadar olan çift sayıların toplamını bulunuz
   // toplam 50 yi grçtiğinde, mesaj yazınız(50 geçildi şeklinde)


         int toplam=0;
         boolean sınırAşıldı=false;

        for (int i = 0; i <=100; i=i+2) {

            toplam=toplam+i;
            System.out.println("i = " + i);

            if (toplam>50 && sınırAşıldı==false) {
                System.out.println("toplam 50 yi geçti");
                sınırAşıldı = true;
            }


        }

        System.out.println("toplam = " + toplam);





















    }
}
