package Gün27._01_Örnek;

public class Utility {//sınıfın, tipin adı
    public String getString(int sayı){
        return String.valueOf(sayı);
        //String e çevir ver
    }
    //Eğer bir metod nesnenin özelliklerini
    //kullanıyorsa nesne oluşturulmadan
    //kullanılamaz.Dolayısıyla STATİC olamaz
    //nesme şşart

    public static String getString2(int sayı){
        return String.valueOf(sayı);
        //string e çevir ver
    }
    //Bağımsız metodlar yani STATİC metodlar
    //herhangi bir nesneye bağlı çalışması gerekmeyen metodlardır.
}
