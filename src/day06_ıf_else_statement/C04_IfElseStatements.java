package day06_ıf_else_statement;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter isteyin
        //girilen karakterin buyuk harf olup olmadığını girin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");

        char girilenharf=scan.next().charAt(0);
        if (girilenharf>='A'&& girilenharf<='Z'){
            System.out.println("girilen harf büyük harf");
        }else {
            System.out.println("girilen harf büyük harf değils");
        }


    }
}
