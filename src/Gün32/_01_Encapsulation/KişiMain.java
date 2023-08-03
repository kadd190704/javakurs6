package Gün32._01_Encapsulation;

public class KişiMain {
    public static void main(String[] args) {
        Kişi kişi1=new Kişi();
       //kişi1.ad="ismet";
        //kişi1.soyad="temur";
        //kişi1.yaş=-25;

        kişi1.setAd("ismet");
        kişi1.setSoyad("temur");
        kişi1.yaşAta(-25);

        System.out.println(kişi1.getAd());
        System.out.println(kişi1.getSoyad());
        System.out.println(kişi1.yaşVer());


        //değişkene direk erişimi kapatıp
        //bir metod ile korumalı veri gönderme ve alma
        //işletimine Encapsulation denir
    }

}
