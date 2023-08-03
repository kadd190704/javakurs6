package Gün34._02_Soru;

public class İlkÖğrencisi extends Öğrenci{
    private String klup;

    public İlkÖğrencisi(String isim, String klup) {
        super(isim,OgrTip.İLK);
        setKlup(klup);
    }

    @Override
    public String toString() {
        return super.toString()+" ,kulübü="+this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}
