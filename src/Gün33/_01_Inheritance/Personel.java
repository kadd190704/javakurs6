package Gün33._01_Inheritance;

public class Personel {
    private String ad;
    private String soyad;
    private int yaş;
    private double maaş;
    private String departman;
    private int sicilNo;
    private String telefon;
    private String tcNo;

    public void bordoYazdır(){
        System.out.println("bordo yazdırıldı");
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

    public double getMaaş() {
        return maaş;
    }

    public void setMaaş(double maaş) {
        this.maaş = maaş;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yaş=" + yaş +
                ", maaş=" + maaş +
                ", departman='" + departman + '\'' +
                ", sicilNo=" + sicilNo +
                ", telefon='" + telefon + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}
