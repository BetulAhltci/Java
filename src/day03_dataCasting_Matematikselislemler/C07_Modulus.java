package day03_dataCasting_Matematikselislemler;

public class C07_Modulus {
    public static void main(String[] args) {
        //% işareti javada bölme işlemi sonucu kalan sayıyı verir

        System.out.println(15%4);//3
        System.out.println(45%4);//1;

        /*kullanıcını girdiği sayı cift sayımı?
        girilensayı%2 işleminin soncu 0 ise çift sayıdır

        kullsnıcının girdiği sayı 7 nin katımı
         girilensayı%7 işleminin sonucu 0 ise katıdır*/


        //kullanıcın girdiği sayının birler basamağı nedir
        // sayı=3426

        int girilensayı=3426;
        int birlerbas=girilensayı%10;
        System.out.println("birler bas:"+birlerbas);//6

         girilensayı=girilensayı/10;
        System.out.println(girilensayı);//342


        birlerbas=girilensayı%10;
        System.out.println("birler bas:"+birlerbas);//2

        girilensayı=girilensayı/10;
        System.out.println(girilensayı);//34

        birlerbas=girilensayı%10;
        System.out.println("birler bas:"+birlerbas);//4

        girilensayı=girilensayı/10;
        System.out.println(girilensayı);//3

        birlerbas=girilensayı%10;
        System.out.println("birler bas:"+birlerbas);//3

        girilensayı=girilensayı/10;
        System.out.println(girilensayı);//0







    }
}
