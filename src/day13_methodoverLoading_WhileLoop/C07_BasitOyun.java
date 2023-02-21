package day13_methodoverLoading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
        random olarak 1 ile 100 arasında bir sayı olusturun
        kullanıcıdan bu sayıyıbilmesini isteyin
        kullanıcı her değer girdiğinde
        tuttuğumuz sayı ile karsılastırıp
        tahmini büyült yada küçült diyelim
        kullanıcı tuttuğumuz sayıyı bildiğinde
        -3 ve daha az thminde bildiyse "Wooowww"
        -4-8 tahminde bildiyse "Aferin
        -daha fazla tahminde bildiyse "başarısız"
        yazdırın
         */

        Random rdn = new Random();
        int tutulansayı = rdn.nextInt(100);
        int sayac = 1;
        int tahmin = 0;

        Scanner scan = new Scanner(System.in);
        while (tutulansayı != tahmin) {
            System.out.println("lütfen bir tahmin giriniz");

            tahmin = scan.nextInt();

            if (tutulansayı == tahmin) {
                System.out.println(sayac + " tahmin ile tuttuğum sayıyı buldun");
                if (sayac <= 3) {
                    System.out.println("Wooouuuwww");
                } else if (sayac <= 8) {
                    System.out.println("aferin");
                } else {
                    System.out.println("başarısız");
                }
                break;
            } else if (tahmin < tutulansayı) {
                System.out.println("sayıyı büyült");
                sayac++;
            } else {
                System.out.println("sayıyı küçült");
            }

        }
    }
}
