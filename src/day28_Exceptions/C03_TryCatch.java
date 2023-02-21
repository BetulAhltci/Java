package day28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        //kullanıcıdan toplamak için sayılralın
        //işlemi bitirmesi için Q'ya basmasını isteyin
        //kullanıcı Q'ya bastığında toplam kac sayı girdiğini
        // ve bu sayıların toplamının kac olduğunu yazdırın

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami=0;

        while(sayiAdedi<10000) {
            try {
                System.out.println("toplamak icin tamsayi girin" +
                        "\nBitirmek icin Q'ya basin");
                girilenSayi = scan.nextInt();
                sayilarToplami += girilenSayi;
                sayiAdedi++;
            } catch (InputMismatchException e) {
                String girilenDeger = scan.nextLine();
                if (girilenDeger.equalsIgnoreCase("q")) {
                    System.out.println("Girilen " + sayiAdedi + " sayinin toplami : " + sayilarToplami);
                    break;
                } else {
                    System.out.println("gecersiz input");
                }
            }
        }
    }
}

