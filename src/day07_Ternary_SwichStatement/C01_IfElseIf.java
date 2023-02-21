package day07_Ternary_SwichStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı alın
        //sayı rakam ise "girilen sayı rakam"
        //sayı iki basamaklı ise "girilen sayı iki basamaklı"
        //sayı iki basamaktan buyukse "buyuk sayı" yazdır


        /*eğer if else cümleleri ELSE ile bitmiyorsa tüm durumları kapsamaz
        yani bazı değerler için hiçbir if body si çalışmayabilir

        bu tur soruları çözerken sartları dikkatli yazmak gerekir
         */



        Scanner scan= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı= scan.nextInt();

        if (0<=sayı && sayı<=9) System.out.println("girilen sayı rakam");
        else if (10<=sayı && sayı<=99) System.out.println("girilen sayı iki basamaklı");
        else if (sayı>=100) System.out.println("büyük sayı");

        }

    }




