package Gün34._03_Soru;

public class Öğrenci {
    private int Id;
    private String isim;
    private OgrTip tipi;


    public Öğrenci(String isim, OgrTip tipi,int Id) {
        setIsim(isim);
        setTipi(tipi);
        setId(Id);
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
