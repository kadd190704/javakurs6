package Gün28._05_Örnek;

public class ElektrikHesabı {
    int toplamTüketim=0;
    double birimFiyat=20;

    public void tüketimEkle(int tüketim){
        toplamTüketim=toplamTüketim+tüketim;
    }
    public void faturaYaz(){
        double tüketimTL=toplamTüketim*birimFiyat;
        System.out.println("**************");
        System.out.println("Faturanız");
        System.out.println("***************");
        System.out.println("Toplam Tüketim="+toplamTüketim);
        System.out.println("Toplam Tutar="+tüketimTL);
        System.out.println("****************");

    }
}
