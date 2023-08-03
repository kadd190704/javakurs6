package Gün41;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate buGün=LocalDate.now();
        LocalDate dün=buGün.minusDays(1);

       boolean sonraMı=buGün.isAfter(dün);//bugün dünden sonra mı
        System.out.println("sonraMı = " + sonraMı);

        boolean onceMi=buGün.isBefore(dün);//bugün dünden önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=buGün.isEqual(dün);//bugün düne eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artıkYılMı=buGün.isLeapYear();//bu günün bulunduğu yıl artık yıl mı
        System.out.println("artıkYılMı = " + artıkYılMı);
    }
}
