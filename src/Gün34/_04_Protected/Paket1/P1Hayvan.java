package Gün34._04_Protected.Paket1;

public class P1Hayvan {
    public String ad;//her yerden bütün paketlerden ulaşılır
    int yaş;  //default:sadece aynı paketten
    protected String cinsi; //default gibi sadece bir farkla
    private String renk;//sadece kendi bulunduğu class
}
