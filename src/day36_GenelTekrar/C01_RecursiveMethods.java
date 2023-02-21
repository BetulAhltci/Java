package day36_GenelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir tam sayı alıp
        //o sayıdan sıfıra kadar olan pozitif tam sayıları toplayın

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayı giriniz");
        int sayi=scan.nextInt();

        toplamForloop(sayi);
        System.out.println(toplaRecusive(sayi));

    }

    private static int toplaRecusive(int sayi) {

        if (sayi>0){
            return (sayi+toplaRecusive(sayi-1));
        }else{
            return sayi;
        }


    }

    private static void toplamForloop(int sayi) {
        int toplam=0;
        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println("for Loop ile toplam "+toplam);
    }
}
