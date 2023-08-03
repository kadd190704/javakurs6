package Gün34._02_Soru;

public class Öğrenci {
    private int Id;
    private String isim;
    private OgrTip tipi;

    private static int sayaçID=1;

    public Öğrenci( String isim,OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        setId(sayaçID++);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }


    @Override
    public String toString() {
        return "Öğrenci" +
                "Id=" + Id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi;
    }
}
