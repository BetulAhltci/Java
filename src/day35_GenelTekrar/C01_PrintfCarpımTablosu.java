package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpımTablosu {
    public static void main(String[] args) {
        //kullanıcıdan bir rakam alın ve carpım tablosu olusturun

        Scanner scan=new Scanner(System.in);
        int girilensayi=0;

        while (girilensayi<=1 || girilensayi>=10) {
            try {
                System.out.println("Carpım Tablosu olusturmak için pozitif bir rakam giriniz ");
                girilensayi = scan.nextInt();

                if (girilensayi > 1 && girilensayi < 10) {
                    break;
                }
                System.out.println("Carpım Tablosu olusturmak için pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("ÇarpımTablosu için pozitif bir rakam girmelisiniz");
                scan.next();
            }
        }
        for (int i = 1; i <=girilensayi ; i++) {

            for (int j = 1; j <=girilensayi ; j++){

                int carpim=i*j;
                System.out.printf("%d  "+carpim);
            }
            System.out.println("");
        }
        /*
        sayıların arasında 2 space var
        sayıları iki karakter seklinde yazılıp saga dayalı yapıldı
        "%2d  " ifadesi saga dayalı iki basamakı yazar 2'nin önüne - konursa sola dayalı yazar
         */



    }
}
