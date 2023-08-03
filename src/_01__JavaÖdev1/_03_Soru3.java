package _01__JavaÖdev1;

public class _03_Soru3 {
    public static void main(String[] args) {

        //String olarak verilen 3 taksit bilgisinin ortalamasını ondalıklı olarak bulunuz.
        String taksit1="150";
        String taksit2="185";
        String taksit3="95";

        double rakamTaksit1=Integer.parseInt(taksit1);
        double rakamTaksit2=Integer.parseInt(taksit2);
        double rakamTaksit3=Integer.parseInt(taksit3);
        double toplam= rakamTaksit1+rakamTaksit2+rakamTaksit3;
        double ortalama= toplam/3;
        System.out.println("ortalama = " + ortalama);

















    }
}
