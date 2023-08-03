package Gün33._02_Inheritance;

import java.util.HashMap;

public class Kedi extends Hayvan {

    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
        //super:miras alınan sınıf
    }

    @Override
    public void konuştu() {
        super.konuştu(); //ses çıkardığını ayrietten yazıyor
        System.out.println(" kedi miyavladı");
    }
}
