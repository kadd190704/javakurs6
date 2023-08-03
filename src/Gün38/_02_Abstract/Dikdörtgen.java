package Gün38._02_Abstract;

public class Dikdörtgen extends Şekil {
    private double kısaKenar;
    private double uzunKenar;

    public Dikdörtgen(double kısaKenar, double uzunKenar) {
        setKısaKenar(kısaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return this.kısaKenar*this.uzunKenar;
    }

    @Override
    double çevre() {
        return (this.uzunKenar+this.kısaKenar)*2;
    }

    public double getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(double kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }


}
