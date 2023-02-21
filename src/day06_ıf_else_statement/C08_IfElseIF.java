package day06_ıf_else_statement;

import java.util.Scanner;

public class C08_IfElseIF {
    public static void main(String[] args) {
        // kullanıcıdan aldığığı ürün adedi ve liste fiyatını alın
        //musteriye müşteri kartı olup olmadığını sorun
        //müşteri kartı varsa 10 üründen fzla alırsa %20 yoksa %15 indirim yap
        //müşteri kartı yoksa 10 üründen fazla alırsa %15 yoksa %10 indirim yapın


        Scanner scan= new Scanner(System.in);
        System.out.println("ürün adedi giriniz");
        int urunadedı=scan.nextInt();
        System.out.println("liste fiyatını giriniz");
        double lıstefıyatı=scan.nextDouble();
        System.out.println("müşteri kartınız varmı"+"E:Evet H:Hayır");
        char kartvarmı=scan.next().charAt(0);

        if((kartvarmı=='E')&& (urunadedı>10)){
            System.out.println("%20 indirimli toplam fiyat"+urunadedı*lıstefıyatı*0.8);}
        else if(kartvarmı=='E'&& urunadedı>0){
            System.out.println("%15 indirimli toplam fiyat)"+urunadedı*lıstefıyatı*0.85);}
        else if (kartvarmı=='H'&& urunadedı>10){
            System.out.println("%15 indirimli toplam fiyat"+urunadedı*lıstefıyatı*0.85);}
        else if (kartvarmı=='H'&& urunadedı>0){
            System.out.println("%10 indirimli fiyat"+urunadedı*lıstefıyatı*0.9);}
        else{
            System.out.println("geçersiz bilgi");
        }



    }
}
