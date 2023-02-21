package day06_ıf_else_statement;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args){
        // kullanıcıdan aldığığı ürün adedi ve liste fiyatını alın
        //musteriye müşteri kartı olup olmadığını sorun
        //müşteri kartı varsa 10 üründen fzla alırsa %20 yoksa %15 indirim yap
        //müşteri kartı yoksa 10 üründen fazla alırsa %15 yoksa %10 indirim yapın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedi giriniz");
        int urunadedı = scan.nextInt();

        System.out.println("urun liste fiyatını girin");
        double listefiyatı = scan.nextDouble();

        System.out.println("müşteri kartınız varmı\nE:evet H:hayır");
        char kartvarmı = scan.next().charAt(0);

        //kart ana değişken olsun
        if (kartvarmı=='e'||kartvarmı=='E'){ //kart var
            if(urunadedı<=0) System.out.println("geçersiz ürün miktarı");
            else if (urunadedı>10) System.out.println("%20 indirimli toplam fiyat:"+urunadedı*listefiyatı*0.8);
            else System.out.println("%15 indirimli toplam fiyat:"+urunadedı*listefiyatı*0.85);

        }else if (kartvarmı == 'h' ||kartvarmı== 'H'){ //kart yok
            if (urunadedı<=0) System.out.println("gereksiz urun miktarı");
            else if (urunadedı>10) System.out.println("%15 indirimli toplam fiyat:"+ urunadedı*listefiyatı*0.85);
            else System.out.println("%10 indirimli toplam fiyat:"+urunadedı*listefiyatı*0.9);

}else System.out.println("kart bilgisi geçersiz"); //hatalı kart bilgisi
        }
    }

