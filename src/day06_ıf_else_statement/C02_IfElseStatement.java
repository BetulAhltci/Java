package day06_ıf_else_statement;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {
       // kullanıcıdan üçgenin kenar uzunluklarını isteyın
        // üçgen ikizkenar ise "ikizkenae üçgen değise ikizkenar değil" yazdır

        Scanner scan= new Scanner(System.in);
        System.out.println("üçgenin kenar uzzunluklarını girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if ((kenar1==kenar2 && kenar2!=kenar3)||
                (kenar2==kenar3 && kenar2!=kenar3)||
                (kenar3==kenar1 && kenar3!=kenar2)){
            System.out.println("ikizkenar üçgen");}
        else{
            System.out.println("ikizkenar değil");
        }
    }
}
