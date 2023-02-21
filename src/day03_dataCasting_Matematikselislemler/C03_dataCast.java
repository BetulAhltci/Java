package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C03_dataCast {
    public static void main(String[] args) {
        System.out.println(28/5);//5
        // java bölme işlemind eiki int işleme giriyorsa sonucu int olarak vverir.
       //ondalıklı sonuçiçin en az bir değer double olmalı

        //kullanıcıdan iki tam sayı alın. birinci sayıyı ikinciye böl.sonucu ondalıklı al
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("iki sayının bölme sonucu:"+(double)sayi1/sayi2);

    }


    }





