package day06_ıf_else_statement;

import java.util.Scanner;

public class C3_IfelseStatement {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin
        //girilen karakter küçük harf ise onu buyük harf yazdıralım
        //yosa girilen harfi yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("kullanıcıdan bir harf isteyin");
        char girilenkarakter= scan.next().charAt(0);

        if(girilenkarakter>='a' && girilenkarakter<='z'){
            //küçük harf ise büyük harf olarak yazdıralım
            System.out.println((char)(girilenkarakter-32));}
        else {
            //küçük harf değilse girilen harfi yazdıralım
            System.out.println(girilenkarakter);
        }
    }
}
