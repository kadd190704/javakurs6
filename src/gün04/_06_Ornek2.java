package gün04;

public class _06_Ornek2 {
    public static void main(String[] args) {

        String bagis1="500"; //kelime
        String bagis2="1500"; //kelime

        //bana topam bağış miktarı lazım
        //int toplam= bagis1+bagis2; bu oladı
        // bunkarın int e yani rakama dönüştürülmesi lazım

        int rakamBagis1=Integer.parseInt(bagis1);
        int rakamBagis2=Integer.parseInt(bagis2);
        int toplam= rakamBagis1+rakamBagis2;
        System.out.println("toplam = " + toplam);

        //*** iyi öğrenilen bir örnek:)






    }
}
