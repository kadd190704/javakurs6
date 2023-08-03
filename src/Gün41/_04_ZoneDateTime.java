package Gün41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now();
        //şu anda benim bulunduğum yerin default zamanını verir
        //LocalDateTime.now();
        //diğer zonelar için ZoneDateTime.now(ZoneID);

        System.out.println("zdt = " + zdt);

        Set<String> zamanZoneIdleri=ZoneId.getAvailableZoneIds();

        for (String z:zamanZoneIdleri){
            if (!z.toLowerCase().contains("bul"))
                continue;
            System.out.println("z ="+z);
        }
        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("zoneLondon = " + zoneLondon);


    }
}
