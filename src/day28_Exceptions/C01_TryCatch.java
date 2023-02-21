package day28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp
        //sayıları birbirine bölüp sonucu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bölmek için iki tamsayı sayı giriniz");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();

        try {
            //1-try bölümü: yapmak isrediğimiz ama exception riski oluşturan kodlar
            System.out.println("iki sayının bölümü:" + sayı1 / sayı2);
        } catch (ArithmeticException e) {
            //2-catch(): beklediğimiz muhtemel exception ve
            //          bu exc. gerceklesirse hata dökümanını store edebileceğimiz variable
            {
                System.out.println("Bölünecek sayı 0 olamaz");
                e.printStackTrace();
                //3- catch bloğu: exception gercekleşirse calışmasını istediğimiz kodlar
                //                  burayı yazarken öncelikle
                //                  exc. oluştuğunda kodların calışması dursun mu? devam mı etsın?
                //                  karar vermeliyız
            }
        }

    }
}

