package Gün41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {

        //Duration : LocalTime ve LocalDateTime lar arası fark için kullanılır

        long startTime=System.currentTimeMillis();//şu andaki milisaniye cinsinden zaman

        //LocalTime
        LocalTime dersBaşlangıç=LocalTime.of(19,0,0);
        LocalTime dersBitiş=LocalTime.of(21,50,5);

        Duration günlükDersSuresi=Duration.between(dersBaşlangıç,dersBitiş);

        System.out.println("günlükDersSuresi.toDays() = " + günlükDersSuresi.toDays());
        System.out.println("günlükDersSuresi.toHours() = " + günlükDersSuresi.toHours());
        System.out.println("günlükDersSuresi.toMinutes() = " + günlükDersSuresi.toMinutes());
        System.out.println("günlükDersSuresi.toMillis() = " + günlükDersSuresi.toMillis());
        System.out.println("günlükDersSuresi.toNanos() = " + günlükDersSuresi.toNanos());
        System.out.println("günlükDersSuresi.getSeconds() = " + günlükDersSuresi.getSeconds());

        System.out.println("********* LocalDateTime *********");
        LocalDateTime form=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();//bugün

        Duration fark=Duration.between(form,to);
        System.out.println("fark = " + fark);

        System.out.println("fark.toDays() = " + fark.toDays());//farkın toplam günü
        System.out.println("fark.toHours() = " + fark.toHours());//farkın toplam saati
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//farkın toplam dakikası

        System.out.println("************* kodun performansı ***********");
        long finishTime=System.currentTimeMillis();//şu andaki milisaniye cinsinden zaman
        System.out.println("Geçen süre ="+(finishTime-startTime)+" ms");
    }

}
