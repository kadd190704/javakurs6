package Gün33._03_Soru;

public class Çalışan {
    private String isim;
    private double maaş;
    private double maaşKatSayısı;

    public Çalışan(String isim, double maaş, double maaşKatSayısı) {
       setIsim(isim);
       setMaaş(maaş);
       setMaaşKatSayısı(maaşKatSayısı);
    }
    public double maaşHesapla(){
        return this.maaş*this.maaşKatSayısı;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaaş() {
        return maaş;
    }

    public void setMaaş(double maaş) {
        this.maaş = maaş;
    }

    public double getMaaşKatSayısı() {
        return maaşKatSayısı;
    }

    public void setMaaşKatSayısı(double maaşKatSayısı) {
        this.maaşKatSayısı = maaşKatSayısı;
    }

    @Override
    public String toString() {
        return "Bodro\n" +
                "\nisim='" + isim +
                "\n maaş=" + maaş +
                "\nmaaşKatSayısı=" + maaşKatSayısı+
         "\n Ödenecek maaş=" + maaşHesapla();
    }



}
