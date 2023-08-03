package Gün29.Soru;

public class Banka {
    public static void main(String[] args) {
        Müşteri mus1=new Müşteri();
        mus1.müşteriNo=1;
        mus1.ad="Kader";
        mus1.soyadı="Taşdemir";

        mus1.müşteriHesap.paraYatır(100);
        mus1.müşteriHesap.paraYatır(200);
        mus1.müşteriHesap.paraÇek(50);

        System.out.println("mus1 = " + mus1.müşteriHesap);

    }


}
