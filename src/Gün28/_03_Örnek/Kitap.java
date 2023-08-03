package Gün28._03_Örnek;

public class Kitap {
    String name;
    int publishYear;
    String author;


    public Kitap(String name,int publishYear,String author){
        this.name=name;
        this.publishYear= publishYear;
        this.author=author;
    }
    public Kitap(){

    }
    public Kitap(String name,int publishYear){
        this.name=name;
        this.publishYear=publishYear;
    }
    public String toString(){return"Kitap="+this.name+" "+"basım yılı="+this.publishYear+" "+"yazar="+" "+this.author;
    }
}
