package gün04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700;
        byte sayı=5;
        sayı= (byte)toplam; // veri kaybı olmasa bile dikkatli yapılmalı
        System.out.println("sayı = " + sayı);// veri kaybı var

        double oranı=3.7; // ben tam sayı kısmını almak istiyorum

        toplam=(int) oranı; //bilerek sadece tam sayı kısmını aldım
        sayı=(byte) oranı;
        System.out.println("toplam = " + toplam);
        //veri kaybı var ,fakat bilerek yaptığım için sorun yok








    }
}
