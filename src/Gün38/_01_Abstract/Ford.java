package Gün38._01_Abstract;

import Gün38._01_Abstract.BinekOto;

public class Ford extends BinekOto {
    public Ford(String marka, int üretimYılı, int vitesAdedi) {
        super(marka, üretimYılı, vitesAdedi);
    }

    @Override
    int hızlanmaSüresi() {
        return 0;
    }
}
