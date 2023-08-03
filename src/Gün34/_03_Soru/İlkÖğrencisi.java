package Gün34._03_Soru;

public class İlkÖğrencisi extends Öğrenci {
    private String klup;

    private static int İlkSayaçID=1;
    public İlkÖğrencisi(String isim, String klup) {
        super(isim, OgrTip.İLK,İlkSayaçID++);
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
