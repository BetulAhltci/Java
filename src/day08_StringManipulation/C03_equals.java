package day08_StringManipulation;

import java.beans.JavaBean;

public class C03_equals {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "Java";
        String str3=new String("Java");
        String str4="Ja";
        String str5=str4.concat("va");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str5);//false

        /* == string için beklediğimiz sonuçları vermeyebilir
        çünkü hem metnin değerini hemde objenin refernsını karşılaştırır
        bu lerde anlatılacak

         Javada string objelerin metinlerinin aynı olup olmdığını kontrol etmek için
         == yerine equals metodu kullanılır

         */

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str5));//true

    }
}
