package Gün08;

public class _07_JavacomparisonOperators {
    public static void main(String[] args) {

     //eşit mi, farklı mı, büyük mü,  küçük mü,büyükeşit mi, küçükeşit mi


     int a=50;
     int b=50;

     //= atama işareti,   ==eşit mi?
     boolean eşitMi=(a==b); //a  b ye eşit mi

        System.out.println("eşitMi = " + eşitMi);
        System.out.println("a b den farklı mı = " +(a !=b) );
        System.out.println("a b den büyük mü = " +(a>b) );
        System.out.println("a b den küçük mü = " +(a<b) );
        System.out.println("a b den büyük veya eşitMi = " + (a>=b));
        System.out.println("a b den küçük veya eşitMi = " + (a<=b));




















    }
}
