package Gün40;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {
        //Canlı digital saat yapınız.
        //aynı yere yazacak

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {

            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            //1 sn bekle
            Thread.sleep(1000);

        }
    }


}
