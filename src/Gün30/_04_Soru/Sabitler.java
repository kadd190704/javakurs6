package Gün30._04_Soru;

public class Sabitler {
    final static int BirGündekiSaatSayısı=24;
    final static int BirSaattekiDakikaSayısı=60;
    final static int  BirDakikadakiSaniyeSayısı=60;


    public static int hesapla(int gün,int saat,int dk){
        int toplamSaniye=
                gün
                *Sabitler.BirGündekiSaatSayısı
                *Sabitler.BirSaattekiDakikaSayısı
                *Sabitler.BirDakikadakiSaniyeSayısı
                +
                saat
                *Sabitler.BirSaattekiDakikaSayısı
                *Sabitler.BirDakikadakiSaniyeSayısı
                +
                dk
                *Sabitler.BirDakikadakiSaniyeSayısı;
        return toplamSaniye;
    }
}
