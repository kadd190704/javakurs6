package Gün34._01_Soru;

public class Otobüs extends Araç{
    private int yolcuKapasitesi;
    public Otobüs(String renk, int motorHacmi, String marka,int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);


    }

    @Override
    public String toString() {
        return super.toString()+"\nyolcu kapasitesi="+this.yolcuKapasitesi;
    }

    public int getYolcuKapasitesi() {return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}
