package day06_ıf_else_statement;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        /*öğrencinin notu 85 ise AA,
        (85 ve üstü değilse)65 ve üstü iseBB
        (65 ve üstü değise)50 ve üstü ise CC
        (geriye kalan) DD
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");
        double not=scan.nextDouble();

        if(not<0 || not>100){
        System.out.println("gecersiz not");}
        else if(not>=85){
            System.out.println("notunuz AA");}
        else if(not>=65){
            System.out.println("notunuz BB");}
        else if (not>=50){
            System.out.println("notunuz CC");}
        else{
            System.out.println("geçersiz not");}
        }






    }

