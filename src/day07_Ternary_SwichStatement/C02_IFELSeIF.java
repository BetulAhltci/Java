package day07_Ternary_SwichStatement;

import java.util.Scanner;

public class C02_IFELSeIF {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı alın
        //sayı negatif ise "negatif sayı"
        //sayı rakam ise "girilen sayı rakam"
        //sayı iki basamaklı ise "girilen sayı iki basamaklı"
        //sayı iki basamaktan buyukse "buyuk sayı" yazdır

        Scanner scan= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı<0) System.out.println("negatif sayı");
        else if (sayı<=9) System.out.println("girilen sayı rakam");
        else if (sayı<=99) System.out.println("girilen sayı 2 basamaklı");
        else System.out.println("buyuk sayı");
    }
}
