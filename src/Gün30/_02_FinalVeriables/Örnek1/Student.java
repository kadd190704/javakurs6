package Gün30._02_FinalVeriables.Örnek1;

public class Student {
    final int id;   //nesne
    String fullname;  //nesne

    private static int sayac=1; //kime ait:class
    // final değişkenlerine sadece 1 kez veri atanabilir.
    // o da ya tanımlanırken , ya da Constructor da

    public Student(int id,String fullname) {
        this.id=id;
        this.fullname = fullname;
    }
    public Student(String fullname){
        this.fullname=fullname;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}

