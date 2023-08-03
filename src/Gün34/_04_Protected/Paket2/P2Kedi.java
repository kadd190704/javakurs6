package Gün34._04_Protected.Paket2;

import Gün34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad,String cinsi){
        super.ad=ad;//public
        super.cinsi=cinsi;//protected
        //defaulttan farklı olarak
        //extend edildiğinde diğer paketlerden de erişilebilir.
    }
}
