package day04_Increment_Concatenation;

public class C04_Operatorler {
    public static void main(String[] args) {

        int a= 10;
        int b=15;
        boolean c;
        System.out.println(c=a*15==b*10);//true
        System.out.println(c);//true
        System.out.println(!true);//false eşit değildir ifadesi için != işareti kullanılır

        System.out.println(!(a<b));// false  ifadenin başına ünlem konursa true olanı false a false olanı true çevirir


        /*int a=10
         hem 3 e hem 5 e bölünebilen sayılar
         a%3==0 && a%5==0

         3 e ve 5 e bölünebilen sayılar
         a%3==0 || a%5==0

         0 dan büyük 100 den küçük sayılar
         0<a<100 java üçlü karşılaştırma yapmaz.2 li karşılaştırma yapılıp
                  mantıksal operatörlerle birleştirilir
         0<a && a>100

         0 dan büyük veya 100 den küçük sayılar
         a>0 || a<100

         bir üçgenin üç kenarı a,b,c uzunluklarındadır
         bu üçgenin eşkenar olduğunu kontrol etmek isterseniz
         a==b && b==c

         */

    }
}
