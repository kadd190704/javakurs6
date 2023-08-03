package Gün33._02_Inheritance;

public class Ördek extends Hayvan{
    private int kanatAçıklığı;
    public Ördek(String renk, int kilo, String cinsi,int kanatAçıklığı) {
        super(renk, kilo, cinsi);
        setKanatAçıklığı(kanatAçıklığı);

    }

    @Override
    public void konuştu() {
       // super.konuştu();
        System.out.println("ördek vakladı");
    }

    @Override
    public String toString() {
        return super.toString()+" kanat açıklığı="+kanatAçıklığı;
    }

    public int getKanatAçıklığı() {
        return kanatAçıklığı;
    }

    public void setKanatAçıklığı(int kanatAçıklığı) {
        this.kanatAçıklığı = kanatAçıklığı;
    }
}
