package day03_dataCasting_Matematikselislemler;

import java.util.Scanner;

public class C08_SayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {
        // kullanıcıdan dört basamaklı bir tam sayı alın
        //sayının rakamlar toplamını bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir sayı giriniz");
        int sayı=scan.nextInt();//1234

        int bırlerbas=0;
        int rakamlartop=0;

        bırlerbas=sayı%10;//4
        System.out.println(bırlerbas);
        rakamlartop=rakamlartop+bırlerbas;//0+4


        sayı=sayı/10;//123
        bırlerbas=sayı%10;
        System.out.println(bırlerbas);//3
       rakamlartop=rakamlartop+bırlerbas;//4+3


        sayı=sayı/10;//12
        bırlerbas=sayı%10;
        System.out.println(bırlerbas);//2
        rakamlartop=rakamlartop+bırlerbas;//7+2

        sayı=sayı/10;
        bırlerbas=sayı%10;
        System.out.println(bırlerbas);//1
        rakamlartop=rakamlartop+bırlerbas;//9+1
        System.out.println(rakamlartop);
    }
}
