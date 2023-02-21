package day13_methodoverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
       // kullanıcıdan toplamak üzere sayı alın
        //girilen sayıların toplamı 500 olur veya geçerse
        //"bu kadar sayı yeter" yazdırın

        //bu soruyu for loop ile yapalım dersek adım sayısını tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplamak üzere tam sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }




        }

    }

