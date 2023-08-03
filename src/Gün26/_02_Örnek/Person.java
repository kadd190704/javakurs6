package Gün26._02_Örnek;

public class Person {
    String name;
    String surname;
    int age;
    //field,properties,özellik

    public void bilgiYazdır(){
        System.out.println("Adı:"+this.name);
        System.out.println("Soyadı:"+this.surname);
        System.out.println("Yaşı:"+this.age);
    }
    public String toString(){
        String yazılacakYazı=this.name+"\t"+
                            this.surname+"\t"+
                            this.age;
        return yazılacakYazı;
    }
    public void getBirthYear(){
        System.out.println("Doğum Yılı="+(2023-this.age));
    }
    public int getBirthYear2(){
        int dogumYılı=2023-this.age;
        return dogumYılı;
    }
}
