package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        //kullanıcıdan bölunecek sayı ve bölecek sayıyı alıp bölme işleminin sonucunu
        //carpma işlemi ile bulan ve yazdıran bir method olusturun
        //bu işlemi kullanıcı q ya basıncaya kadar devam ettirin

        Scanner scan=new Scanner(System.in);
        boolean devamEdelimmi=true;
        int boluneceksayi=1;
        int bolensayi=1;

        do {
            System.out.println("Lütfen bolunecek tamsayıyı girin\nbitirmek için Q'ya basın");

            try {
                boluneceksayi=scan.nextInt();
                System.out.println("Bölecek sayıyı giriniz");
                bolensayi=scan.nextInt();
                bolumSonucuYazdir(boluneceksayi,bolensayi);

            } catch (InputMismatchException e) {

               String girilenstr=scan.nextLine();
               //21. satırda nextint() ile değeri alamadıysa exception olusacak
                //bu satıra gelecek ve biz o değeri nextLine() ile alacağız

               if (girilenstr.equalsIgnoreCase("q")){
               devamEdelimmi=false;
            }else{
                   System.out.println("bölünecek sayı tamsayı olmalıdır");
               }

            }


        }while (devamEdelimmi);



    }

    private static void bolumSonucuYazdir(int boluneceksayi, int bolensayi) {
        //boluneek sayı ve bolen sayı negatif veya pozitif olabilir
        //bu durumda öncelikle işaret kontrolu yapmamız lazım
        //işaret sorununu cözmek için





    }
}
