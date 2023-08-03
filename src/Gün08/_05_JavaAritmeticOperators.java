package Gün08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {

     int sayac=0;

     sayac =sayac+1; //sayacın değerini 1 arttırıyor
     sayac++;        //sayacın değerini 1 arttırıyor
     ++sayac;        //sayacın değerini 1 arttırıyor

     sayac=sayac-1; //sayacın değerini 1 azaltıyor
     sayac--;       //sayacın değerini 1 azaltıyor
     --sayac;       //sayacın değerini 1 azaltıyor

        System.out.println("sayac = " + sayac);
        //**************
        int toplam=5+sayac; // önce:sayac=0, toplam=0,sonra:toplam=5, sayac=0

        toplam=0;
        toplam=5+ sayac++; //önce:sayac=0, toplam=0, sonra:toplam=5, sayac=1
        //************
        toplam=0; int sayı=0;
        //işlemden önce:toplam=0, sayı=0
        toplam=5;
        sayı=0;
        //işlemden sonra:toplam=5, sayı=0

        //*****************************/
        toplam=0; sayı=0;

        //işlemden önce:toplam=0 ;sayı=0
       // toplam=5, sayı++; //toplam=5+sayı;sayı++;
        //işlemden sonra:toplam=5; sayı=1

        //**************************/
        toplam=0;      sayı=0;
        //işlemden önce: tolam=0, sayı=1
        toplam=5+  ++sayı; //önce ++sayı; sonra toplam=5 +sayı;
        //işlemden sonra: toplam=6 , sayı=1






















    }
}
