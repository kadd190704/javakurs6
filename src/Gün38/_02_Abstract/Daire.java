package Gün38._02_Abstract;

public class Daire extends Şekil{
    private double yarıçap;

    public Daire(double yarıçap) {
        setYarıçap(yarıçap);
    }

    @Override
    double alan() {
        return Math.PI*yarıçap*yarıçap;
    }

    @Override
    double çevre() {
        return 2*Math.PI*yarıçap;
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }
}
