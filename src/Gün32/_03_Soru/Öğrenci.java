package Gün32._03_Soru;

public class Öğrenci {
    private String ad;
    private String soyad;
    private int yaş;

   private static int sayaçId=1;

    public Öğrenci(String ad, String soyad, int yaş) {
        setAd(ad);
        setSoyad(soyad);
        setYaş(yaş);

        int okulNo = sayaçId++;
    }

    @Override
    public String toString() {
        return "Öğrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yaş=" + yaş +
                '}';
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

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }
}
