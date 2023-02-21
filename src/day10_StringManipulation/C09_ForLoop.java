package day10_StringManipulation;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        // kullanıcıdan başlangıç ve bitiş değerlerini alıp bu sınırlar dahil olarak
        //bu sayılar atrasında 5 in katı olan sayıları yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("başlangıc değerini iriniz");
        int baslangıc=scan.nextInt();
        System.out.println("bitiş değerini giriniz");
        int btıs=scan.nextInt();

        for (int i = baslangıc; i <=btıs ; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }

        }
    }
}
