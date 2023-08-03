package Gün42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        
        String cümle="";
        
        cümle=cümle+"Bugün";
        cümle=cümle+" hava";
        cümle+=" çok soğuk";

        System.out.println("cümle = " + cümle);
        System.out.println(cümle +=" değil mi" );
        //Bugün hava çok soğuk
        System.out.println("cümle.concat() = "+ cümle.concat(" dün değildi"));
        System.out.println("cümle = " + cümle);
        cümle.concat(" merhaba");// cümlenin değeri değişmez, atama gerektirir
        cümle=cümle.concat(" merhaba");// cümlenin değeri değişir

        /************* StringBuilder *************/
        StringBuilder cümle2=new StringBuilder();
        cümle2.append("Bugün");// direk kendisine atıyor, eşitleme gerekmiyor
        cümle2.append(" hava");
        cümle2.append(" soğuk");

        System.out.println("cümle2 = " + cümle2);

        /**********+,concat,StringBuilder 3 model hız testi **********/

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 1000; i++) {
            test1=test1+" merhaba";
        }
        System.out.println("+ için geçen süre = " +(System.currentTimeMillis()-startTime));

        startTime =System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 1000; i++) {
            test2=test2.concat(" merhaba");

        }
        System.out.println(" concat için geçen süre = " +(System.currentTimeMillis()-startTime));

        startTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba");
        }
        System.out.println(" StringBuilder için geçen süre ="+(System.currentTimeMillis()-startTime));


        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("\n\n****** StringBuilder *****************");
        /*         StrinBuilder i yakından tanıyalımm  */

        StringBuilder sb=new StringBuilder();
        sb.append(" Bugün");//kendine ekleme, atama gerektirmiyor
        sb.append(" hava ");
        sb.append("biraz soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);

        sb.reverse();//Stringi ters çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5);//index: 0 dahil, 5 hariç siliyor
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);//sadece belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime");// 5 nolu indexe kelime yi ekle, araya ekleme
        System.out.println("sb = " + sb);

        String parca=sb.substring(5,8); //5 dahil 8 değil
        System.out.println("parca = " + parca);

        //string fonksiyonlar için to String demek yeterli
        sb.toString().endsWith("de");

        sb.replace(5,8,"Saç"); //verilen aralığa verilen kelime eklenir
        System.out.println("sb = " + sb);

        sb=new StringBuilder();//tamamen sıfırlamak yenilemek
        sb=new StringBuilder("Bugün hava soğuk");//ilk atama yapılabilir

        StringBuffer sBuffer=new StringBuffer();// tamamen StringBuilder aynı
        //tek farkı paralel çalışan yazılımlar için kullanılır





















    }
}
