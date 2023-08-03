package Gün41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {

     //Period 2 tarih arasındaki farkı tutar
     //LocalDate ler için kullanılır

        LocalDate doğumTarihi=LocalDate.of(2000,01,05);
        LocalDate buGün=LocalDate.now();

        Period fark=Period.between(doğumTarihi,buGün);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yaşındasınız.");


        /*****************************************************/
        Period period3Gün=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gün = " + period3Gün);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate uçGünSonra=buGün.plus(period3Gün);
        System.out.println("uçGünSonra2  = " + uçGünSonra);

        LocalDate uçGünSonra2=buGün.plusDays(3);
        System.out.println("uçGünSonra = " + uçGünSonra2);

        LocalDate ucAySonra=buGün.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        System.out.println("*********************************");
        //1.Soru :Kursun bitiş tarihini bulunuz 6 ay :15.05.2023
        LocalDate kursBaşlangıç=LocalDate.of(2023,5,15);
        Period kursSüre=Period.ofMonths(6);
        LocalDate kursbitiş=kursBaşlangıç.plus(kursSüre);
        System.out.println("kursbitiş günü = " + kursbitiş.getDayOfWeek());

        //2.Soru :Kursun bitmesine ne kadar süre kaldı?
        Period neKadarSüreKaldı=Period.between(buGün,kursbitiş);
        System.out.println("neKadarSüreKaldı = " + neKadarSüreKaldı);

        //3.Soru : Ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi=Period.between(kursBaşlangıç,buGün);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);









    }


}
