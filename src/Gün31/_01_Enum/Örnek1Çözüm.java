package Gün31._01_Enum;

public class Örnek1Çözüm {
    //enumaration:numaralandırılmış simgeler
    //class ın içinde de enum tanımlanabilir, ancak METOD larıniçine tabımlanamaz

    public static void main(String[] args) {
        int sayı=5;//gibi
        Aylar ay= Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30);break;
        }
        if(ay== Aylar.MAYIS)
            System.out.println("Zam ayı");
        System.out.println("ay = " + ay);//toString SİMGE MAYIS
        System.out.println("ay.name() = " + ay.name());//SİMGE MAYIS
        System.out.println("ay.ordinal() = " + ay.ordinal());//SİMGE NIN indexi

        for (Aylar a: Aylar.values())
            System.out.println(a.name()+"-"+a.ordinal());


    }// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.



}
