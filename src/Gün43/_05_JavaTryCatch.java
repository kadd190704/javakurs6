package Gün43;

import java.lang.ref.SoftReference;
import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");

        try { //dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);//RUNTİME ERROR
        } //hata olduğu zaman  programı kırma
        catch (Exception ex){ //ex isimli değişkende oluşan hataların bilgisi atanıyor
            //hata olduğunda yapılması istenenler buraya yazılır
            System.out.println("Hata oluştu"+ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            //log tutabilirsin, ekranın fotoğrafını alabilirsin
        }
        System.out.println("program bitti");
        //kursdaki  hata durum yönetimi

        try {
            //Java ve Toolları çalışmaya devam et
            //Konuları grupla çalışmaya devam
            //anlamadığın yerler mi oldu, rutine error
        }
        catch (Exception ex){
            //hatannın sebebini anla
            //derse daha fazla odaklan
            //anlamadığın yerleri sor
            //videoları tekrar izle
            //grup çalışmasına devam et
        }












    }
}
