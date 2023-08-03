package Gün36._06_Interface;

public class Dikdörtgen implements IGeometri {

    @Override
    public int alan(int kısaKenar, int uzunKenar) {
        return kısaKenar*uzunKenar;
    }

    @Override
    public int çevre(int kısaKenar, int uzunKenar) {
        return (kısaKenar+uzunKenar)+2;
    }
}
