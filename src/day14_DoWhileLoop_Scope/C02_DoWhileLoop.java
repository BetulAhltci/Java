package day14_DoWhileLoop_Scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayı alın
        //kullanıcı değer olaral 0 a basarsa işlemi bitirin

        int girilensayı=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("lütfen toplanmak için bir tam sayı girin");
            girilensayı=scan.nextInt();
            toplam+=girilensayı;

        }while (girilensayı!=0);
        System.out.println("girilen sayıların toplamı: "+toplam);

        /*
        while loopda ilk şart sağlanmazsa loop body hiç çalışmaz
        Do-While Loopda önce body calıştığı için şart yanlış olsa bile
        loop body si en azbir kere calışmış olur
         */
    }
}
