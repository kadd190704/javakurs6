package Gün35._02_Polymorphism;

public class ÇiftlikMain {
    public static void main(String[] args) {

       Köpek köpek1=new Köpek("karabaş");
    //    köpek1.ses();//havladı
    //    köpek1.koku();//kokladı

       Kedi kedi1=new Kedi("tekir");
    //    kedi1.ses();//miyavladı
    //    kedi1.tırmalama();//tırmaladı

    //    köpekSesi(köpek1);//havladı
    //    kediSesi(kedi1);//miyavladı

        hayvanSesi(köpek1);
        hayvanSesi(kedi1);

        //Setleden HashSet
        //Maplardan HasMap
        //Listlerden ArrayList

        //Hayvanlardan kedi
        //Hayvanlardan köpek
        //Hayvanllardan hayvan

        //Referansın tipi //NESNE nin tipi
        Hayvan hayvan1=new Hayvan("ördek");
        Hayvan hayvan2=new Köpek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");

        System.out.println("-------------------");
        hayvan1.ses();//ses çıkardı
        hayvan2.ses();//havladı
        hayvan3.ses();//miyavladı
        System.out.println("-------------------");

        ((Köpek)hayvan2).koku();

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.















    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();//hem havladı hem miyavladı yazdırdı

        //bir classın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Köpek)//hayvan aslında köpek ise
            ((Köpek)hayvan).koku();

        if (hayvan instanceof Kedi)//hayvan aslında kedi ise
            ((Kedi)hayvan).tırmalama();
    }
    public static void köpekSesi(Köpek köpek){
        köpek.ses();//havladı
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();//miyavladı
    }
}
