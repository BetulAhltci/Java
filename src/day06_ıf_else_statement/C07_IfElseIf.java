package day06_ıf_else_statement;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        /*
        kullanıcıdan kilo(kg)  ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayın (kilo*10000/(boy*boy)
        25-30 arası kilolu
        20-25 arası normal
        20 den küçuk ise zayıf yazdırın
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();
        double vke=kilo*10000/(boy*boy);
        System.out.println("vucut kitle endeksiniz:"+ vke);

        if (vke>=30) System.out.println("obez");
        else if (vke>=25) System.out.println("kilolu");
        else if (vke>=20) System.out.println("normal");
        else System.out.println("zayıfsın");

    }
}
