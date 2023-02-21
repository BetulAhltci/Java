package day08_StringManipulation;

public class C04_equalsıgnoreCase {
    public static void main(String[] args) {

        String str1= "Pazar";
        String str2= "PAZAR";
        String str3= "pazar";
        String str4= "PaZaR";

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equals(str4));//false

        /* eğer iki metni karşılaştırırken buyuk harf küçük har duyarlılığı(case sensitive)
        önemsiz ise equalsIgnoreCase() kullanılır
         */

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase(str4));//true
    }
}
