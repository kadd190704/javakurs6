package Gün43;

public class _07_TryCatchFinally {
    public static void main(String[] args) {
     String str="";
     long startTime=0;

     try{
         System.out.println("hatadan önceki kısım");
         char ilkHarf=str.charAt(0);
         System.out.println("hatadan sonraki kısım");
     }
     catch (Exception ex){
         System.out.println("catcah bloğu çalıştı");
         //hata olduğunda yapılacaklar
     }
     finally { //hata olsa da olmasa da çalışıyor
         System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
         System.out.println(System.currentTimeMillis()-startTime);
     }
        System.out.println("diğer çalışacak kodlar");
        System.out.println("program bitti ");








    }
}
