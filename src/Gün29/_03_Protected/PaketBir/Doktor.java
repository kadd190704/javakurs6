package Gün29._03_Protected.PaketBir;

public class Doktor {
     public String hastaneAd; //public: diğer paketlerden erişim var
    String adı;              //default
    protected String bölümü;  //default gibi
    private String sicilNo;   //sadece class ın içinden erişilebilir

     Doktor() {  //sadece kendi paketindekiler erişebilir
    }

    public Doktor(String adı) {//diğer tüm paketlerden erişilebilir
        this.adı = adı;
    }
}
