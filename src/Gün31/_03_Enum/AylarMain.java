package Gün31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.günMiktarı = " + ay.günMiktarı);
        System.out.println("ay.ayAd = " + ay.ayAd);

        for (Aylar a:Aylar.values())
            System.out.println(a.ayNo+"-"+a.günMiktarı+"-"+a.ayAd);

        //Month.NOVEMBER
    }
}
