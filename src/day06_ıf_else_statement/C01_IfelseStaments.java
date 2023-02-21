package day06_ıf_else_statement;

import java.util.Scanner;

public class C01_IfelseStaments {
    public static void main(String[] args) {
        // kullanıcan bir üçgenin üc kenarını isteyin
        // eşkenar ise "eskenar üçgen" değise "eşkenar deği" yadır

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eşkenar Üçgen");
        }else{
            System.out.println("Eşkenar değil");
        }

        /* if ilw başlayan bir kod else ile bitiyorsa imputun tüm değerlerini kapsar
        yani her değer için mutlaka kodumuzda bir body çalışır
         */
    }
}
