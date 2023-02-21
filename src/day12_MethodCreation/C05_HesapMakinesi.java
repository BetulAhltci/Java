package day12_MethodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı ve istediği işlemi alın (+ / * -)
        //bir metod oluşturup sayılara istenen işlemi uygulayıp
        //sonucu bize döndürun
        //kullanıcı işlemi yanlış girmişse 0 yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        System.out.println("lütfen bir işlem giriniz");
        char işlem=scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayı1, sayı2, işlem));

    }

    public static double hesapMakinesi(double sayı1,double sayı2,char işlem){
        switch (işlem){
            case '+':
                return sayı1+sayı2;

            case'-':
                return sayı1-sayı2;

            case'/':
                return sayı1*sayı2;

            case'*':
                return sayı1/sayı2;

            default:
                return 0;
        }
    }




}
