package Gün34._02_Soru;

public class LiseÖğrencisi extends Öğrenci{

private String branş;

    public LiseÖğrencisi(String isim, String branş) {
        super(isim,OgrTip.LİSE);
        setBranş(branş);
    }


    public String getBranş() {
        return branş;
    }

    public void setBranş(String branş) {
        this.branş = branş;
    }

    @Override
    public String toString() {
        return super.toString()+"branş="+this.branş;
    }
}
