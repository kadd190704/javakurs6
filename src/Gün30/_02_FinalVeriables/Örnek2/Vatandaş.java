package Gün30._02_FinalVeriables.Örnek2;

public class Vatandaş {
    String isim;
    String adres;
    final int tcNo;

    private static int sayaç=1;

    public Vatandaş(String isim,String adres) {
        this.isim=isim;
        this.adres=adres;
        this.tcNo = sayaç++;
    }

    @Override
    public String toString() {
        return "Vatandaş{" +
                "isim=" + isim + '\'' +
                ", adres=" + adres + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
