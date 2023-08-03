package Gün36._05_Interface;

public class Test implements IGösterir,IYazdırır{
    @Override
    public void göster() {
        System.out.println("gösterir");
    }

    @Override
    public void yazdır(String msg) {
        System.out.println("yazdırır");

    }

    @Override
    public void yaz() {
        System.out.println("yazdırır");

    }

    @Override
    public int YazdırmaSayısıGöster() {
        int sayfaSayısı=5;
        return sayfaSayısı;
    }
}
