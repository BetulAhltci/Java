package day05_ifStatements;

import java.util.Scanner;

public class C01_ifstatements {
    public static void main(String[] args) {
        //öğrençiden notları rakam olarak alın harf olarak yazdırın
        //0-49,999 DD
        //50-64,999 CC
        //65-84,999 BB
        //85-100 AA

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu girin");
        double not= scan.nextDouble();

        if(0<=not && not<50){
            System.out.println("notunuz DD, malesef kaldınız");
        }
        if(50<=not && not<65){
            System.out.println("notunuz CC, tebrikler geçtiniz");
        }
        if(65<=not && not<85){
            System.out.println("notunuz BB");
        }
        if(85<=not && not<=100){
            System.out.println("notunuz AA");
        }

    }
}
