package Gün34._03_Soru;

public class LiseÖğrencisi extends Öğrenci {

private String branş;

private static int LiseSayaçId=1;

    public LiseÖğrencisi(String isim, String branş) {
        super(isim, OgrTip.LİSE,LiseSayaçId++);
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
