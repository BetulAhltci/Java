package day03_dataCasting_Matematikselislemler;

public class C05_WrapperClass {
    public static void main(String[] args) {


        /*int primitive olduğundan hzır metotları yoktur.
        String nonPrimitive olduğundan hazır metodları vardır

        int, char, boolean gibi prpmptive variable türlerinde hazır metod kullanmak için java
        İnteger, character,Boolean gibi wroper class lar oluşturmuştur
        bunlar primitive ler ile aynı değerleri alabilir am ekstra metodlarıda vardır
         */
        /* işlemleri yaparken sayısal veri içeren string ifadelerle karşılaşabiliriz.
          matematiksel işlem yapabilmek için bu ifadeti satısal veriye çevirmek gerekir.
         */
        String str2 = "123";
        String str3 = "345";
        System.out.println(str2 + str3);//123345



        System.out.println(str2+str3);//477
        System.out.println(Integer.MAX_VALUE);//2147483...
        System.out.println(Integer.MIN_VALUE);//-2147483...

        System.out.println(Short.MAX_VALUE);//32767


        char krk='$';
        System.out.println(Character.isDigit(krk));//false
        System.out.println(Character.isAlphabetic(krk));//false

        // wrapper class larda casting olmaz
    }
}
