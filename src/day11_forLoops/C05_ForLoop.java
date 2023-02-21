package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen başlangıç ve bitiş değerleri için 2 pozitif tam sayı giriniz");

        int baslangıc=scan.nextInt();
        int bitis=scan.nextInt();

        if (bitis<baslangıc){
            System.out.println("Başlangıc değeri bitiş değerinden kücük olmalı");
        }else{
            int toplam=0;
            for (int i=baslangıc; i<=bitis;i++){
                toplam+=i;
            }
            System.out.println(toplam);
        }




    }
}
