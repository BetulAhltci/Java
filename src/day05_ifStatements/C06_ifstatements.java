package day05_ifStatements;

import java.util.Scanner;

public class C06_ifstatements {
    public static void main(String[] args) {
        /* kullanıcıdan bir üçgenin 3 kenar uzunluğunu lın
        üçgen eşkenar ise "eşkenar üçgen" yazdır
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen üçgenin 3 kenar uzunluğunu girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("eşkenar üçgen");

        }
    }
}
