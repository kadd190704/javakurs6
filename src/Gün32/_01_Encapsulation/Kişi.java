package Gün32._01_Encapsulation;

public class Kişi {
    String ad; //25 karakter sınırı
    String soyad; //25 karakter sınırı
   private int yaş;
    public void yaşAta(int yaş){
        if (yaş<0)
            System.out.println("Hatalı giriş");
        else
            this.yaş=yaş;
    }
    public void setAd(String ad){
        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("Hatalı giriş");
    }
    public void setSoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı giriş");
    }
    public int yaşVer(){
        return this.yaş;
    }
    public String getAd(){
        return this.ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
}
