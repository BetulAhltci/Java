package day06_ıf_else_statement;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
          /*kullanıcıdan yaşını yaşını ve cinsiyetini alın
        kadın 60 yaş ustu erkek 65 yaş üstu olabilir
        cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        veya  "emekli olmak için ... yıl daha çalışman gerek" yazdır
        */


        /* eğer değişken sayımız birden fazla ise değişkenlerdem birini önceliğe alarak
        ona göre bir if else yapısı kurulur

        bu soruda kadın/erkek seçimini öneliğe alırsak
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("cınsıyetınızı gırınız\nK:kadın,E:Erkek");
        char cınsıyet = scan.next().charAt(0);

        System.out.println("lutfen yaşınızı tam sayı olarak giriniz");
        int yas = scan.nextInt();


        if (cınsıyet == 'K' || cınsıyet == 'k') { //kadın olanlar için bu bölüm çalışacak
            if (yas < 18 || yas >80) System.out.println("geçersiz yaş");
            else if (yas >= 60) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için" + (60 - yas) + "yıl daha çalışmalısın");
        } else if (cınsıyet == 'E' || cınsıyet == 'e') { // erkekler için burası çalışacak
            if (yas < 18 || yas < 80) System.out.println("geçersiz yaş");
            else if (yas >= 65) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için" + (65 - yas) +  "yıl daha çalışmalısın");

        } else {
            System.out.println("cinsiyet bilgisi hatalı");

        }
    }
}
