package day28_Exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
        Try-catch bloklarının amacı riski 0 yapmak değil
        kodu iyi analiz yapıp Java'nın cöemeyeceği durumlarda ne yapmaını ıstediğimizi kendisine söylemektir

        Java try bloğunda basedemeyeceği bir sorunla karsılasırsa
        siz o sorunu deklare edene kadar yanı catch() satırına
         */




        //kullanıcıdan iki tam sayı alıp
        //sayıları birbirine bölüp sonucu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bölmek için iki tamsayı sayı giriniz");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();

        try {
            System.out.println("iki sayının bölümü:" + sayı1 / sayı2);
            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bölen sayı 0 olamaz");
            System.out.println(e.getCause());

        }
    }
}
