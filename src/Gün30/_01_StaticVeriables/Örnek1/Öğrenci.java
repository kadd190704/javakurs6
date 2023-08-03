package Gün30._01_StaticVeriables.Örnek1;

public class Öğrenci {
    String ad;
    String soyad;

    static String okulAd="Yıldırım İlkokulu";
    //kod adı: sen bitanesin
    //hepsi için geçerli tek bir eleman
    //Tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATİC kullanıyoruz
    //static=ssen birtanesin
    //Static varsa hafozadan tasarruf sağlar
    //hepsine atanır, tek olarak hafızada bulunur
    //tipin,sınıfın,classın değişkeni oldu

    public Öğrenci(String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }

    @Override
    public String toString() {
        return "Öğrenci" +
                "\nad=" + ad + '\'' +
                ", \nsoyad=" + soyad + '\'' +
                "\nokulAd="+okulAd+
                '}';
    }
}
