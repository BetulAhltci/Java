package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /* char data türünün ekstra bir özelliği vardır.
        eğer matematiksel bir işlemde char data türünde bir veri kullanılırsa
        java o char ın ASCII değerini gözönunde bulundurarak işlemi gerçekleştirir.
         */
        System.out.println('a'+'b');//97+98=195
        System.out.println('a'-32);//97-32=65-A

        //kullanıcıdan bir char alın
        //ascii tablosundan kullanıcının girdiği char ın sonrasındaki 3 karakteri yazın
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter girin");
        char girilenkarakter=scan.next().charAt(0);
        System.out.println((char) (girilenkarakter+1) + ", " +
                          (char) (girilenkarakter+2)+","+
                          (char) (girilenkarakter+3));
    }
}
