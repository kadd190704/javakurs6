package Gün28._01_Örnek;

public class Öğrenci {
    int id;
    String ad;
    String soyad;
    int sınıf;

    //yapıcı metodlar=Constructor metodlar
 public Öğrenci(){
     System.out.println("nesne oluşturuldu");
 }

 //yapıcı metodlar:Constructor metodlar
 public Öğrenci(int id,String ad,String soyad,int sınıf){
     this.id=id;
     this.ad=ad;
     this.soyad=soyad;
     this.sınıf=sınıf;
 }
 //yapıcı metodlar:Constructor metodlar
 public Öğrenci(int id,String ad,String soyad){
     this(id,ad,soyad,0);

     //this.id=id;
     //     this.ad=ad;
     //     this.soyad=soyad;
     //     this.sınıf=sınıf;


 }




}
