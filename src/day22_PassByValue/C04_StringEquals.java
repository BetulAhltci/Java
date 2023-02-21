package day22_PassByValue;

public class C04_StringEquals {
    public static void main(String[] args) {
        /*
        Java Stringlerde her seferinde yeni obje oluşturmamak için String havuzu kullanır

        Eğer String olusturulurken bugune kadar yaptığımız gibi basit sekilde luştrulursa havuzu ontrol eder
        ve aynı değer varsa bunları eşleştirir

         Ancak new keyword kullanilir veya
        bir islem sonucunda String elde edilecek olursa
        havuza bakmaz, once objeyi olusturur
        sonra atamayi yapar

         */

        String str1="Java";
        String str2="Java";

        String str3=new String("Java");//Java

        String a="Ja";
        String b= "va";

        String str4=a+b;//Java
        String str5=a.concat(b);//Java

        String str6=str5+"";

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        System.out.println(str1.equals(str6));//true
        System.out.println(str1.equals("Java"));//true

        //saedece değerlere bakar

        System.out.println("================================");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
        System.out.println(str1=="Java");//true
        System.out.println(str2=="Java");//true

        //== hem referansa hem değere bakar
    }
}
