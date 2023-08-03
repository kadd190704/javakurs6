package Gün33._02_Inheritance;

public class Yılan extends Hayvan {
    private int uzunluk;
    public Yılan(String renk, int kilo, String cinsi ,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    @Override
    public void konuştu() {
        super.konuştu();
        System.out.println("yılan tısladı");
    }

    @Override
    public String toString() {
        return super.toString()+"uzunluk"+this.uzunluk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
