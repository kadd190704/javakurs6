package Gün36._04_Interface;

public class A4  implements IYazdır,IGösterir{
    @Override
    public void göster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdır() {
        System.out.println("yazdırdı");
    }
}
