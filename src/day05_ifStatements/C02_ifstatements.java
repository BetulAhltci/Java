package day05_ifStatements;

import java.util.Scanner;

public class C02_ifstatements {
    public static void main(String[] args) {



        /* basit if cümleleri kodun geri kalanından bağmsızdır.
        sadece 1 şarta odaklanır.
        o şart true ise if body çalışır
        şart false ise if body çalışmaz(KOD ÇALIŞIR)

        */


        //kullanıcıdan bir sayı alıp
        //pozitif ise pozitif sayı,
        //100 ile 999 arasında ise(sınırlar dahil) "pozitif 3 basamaklı sayı"
        //3  ile bölünebiliyorsa "3 ün katı"
        //birler basamağı 7 ise "mükemmel"
        //seçeneklerden uygun olanı yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz" );
        int sayı=scan.nextInt();

        //pozitif ise "pozitif sayı"
        if(0<sayı){
            System.out.println("pozitif sayı");
        }

        //100 ile 999 arasında ise(sınırlar dahil) "pozitif 3 masamaklı sayı
        if (100<=sayı && sayı<=999){
            System.out.println("pozitif 3 basamaklı sayı");
        }

        //3 ile bölünebiliyorsa "3 ün katı"
        if (sayı%3==0){
            System.out.println("3 ün katı");
        }
        //birler basamağı 7 ise "mükemmel"
        if (sayı%10==7){
            System.out.println("mükemmel");
        }
    }
}
