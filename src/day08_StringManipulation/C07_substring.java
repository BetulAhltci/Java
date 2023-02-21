package day08_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {

         String str="Java ogren, işi kap";
        System.out.println(str.length());// karakter sayısı :19

        //metnin ortasıdaki karakter nedir
        System.out.println(str.charAt(str.length()/2));//n

        //son karakteri yazdırın
        System.out.println(str.charAt(str.length()-1));//p

        //bir karakteri değilde stringin içerdiği metin parçasını almak istersek
        //örneğin "öğren" kelimwsini yazdıralım

        System.out.println(str.substring(5,9));//ogre
        //substring(baş,bitiş9 metodunda
        //baslangıç olarak yazılan index dahil(inclusive)
        //btiş 0larak yzılan index harç(exculisive) dir
        System.out.println(str.substring(5,10));//ögren

        //str dan "java" kelimesini yazdırın
        System.out.println(str.substring(0,4));//Java

        //str'dan "kap" kelimesini yazdırın
        System.out.println(str.substring(16,19));//kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        //substring kullanarak sadece J harfini yadırın
        System.out.println(str.substring(0));//Java ogren, işi kap
        System.out.println(str.substring(0,1));//J

        //substrin kullanarak 9. index deki harfi buyuk harf olarak yazdır
        System.out.println(str.substring(9,10).toUpperCase());//N
        System.out.println(str.toUpperCase().charAt(9));//N
        // charat kullanmak yerine substring kullanmak daha acantajlı olabilir
        //çünku substringde ifade hala string oldugundan metod kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));// hiçlik yazdırır konsolda boş satır görünür

       // System.out.println(str.substring(4,3));//geriye işlem yapmaz hata verir

        //System.out.println(str.substring(25,28));//hata verir

        System.out.println(str.substring(str.length()));//hiçlik yazdırır
        //System.out.println(str.charAt(str.length()));//hata verir

        System.out.println(str.substring(str.length()+1));// hata verir


    }
}
