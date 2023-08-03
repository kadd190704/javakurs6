package Gün38._01_Abstract;

//2 si bir arada => 1 interface+ 1 parent class =abstract class
public abstract class BinekOto { //parent clas

    private String marka;
    private int üretimYılı;
    private int vitesAdedi;

    abstract int hızlanmaSüresi();

    public BinekOto(String marka, int üretimYılı, int vitesAdedi) {
        setMarka(marka);
        setÜretimYılı(üretimYılı);
        setVitesAdedi(vitesAdedi);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getÜretimYılı() {
        return üretimYılı;
    }

    public void setÜretimYılı(int üretimYılı) {
        this.üretimYılı = üretimYılı;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
