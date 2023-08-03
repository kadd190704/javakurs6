package Gün35.Polymorphism_Soru;

public class Kişi {
    private String ad;
    private String soyad;
    private String görevi;

    public static void kimlikBelgesiYazdır(Kişi gelenKişi){
        System.out.println("\n********* Kimlik Belgesi*******");
        System.out.println("Adı="+gelenKişi.getAd());
        System.out.println("Soyadı="+gelenKişi.getSoyad());
        System.out.println("Görevi="+gelenKişi.getGörevi());

        if (gelenKişi instanceof Çalışan)
            System.out.println("Departmanı="+
                    ((Çalışan)gelenKişi).getDepartmanı());

            else
            System.out.println("Şubesi="+
                    ((Öğrenci)gelenKişi).getŞubesi());


    }

    public Kişi(String ad, String soyad, String görevi) {
        setAd(ad);
        setSoyad(soyad);
        setGörevi(görevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGörevi() {
        return görevi;
    }

    public void setGörevi(String görevi) {
        this.görevi = görevi;
    }


}
