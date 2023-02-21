package day09_StringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        String str ="Java öğrenen işsiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));//true;
        System.out.println(str.endsWith("Java öğrenen işsiz kalmaz"));//true
        System.out.println(str.endsWith(""));//true

        //kullanıcıdan bir mail alın
        //-mail @ içermiyorsa "geçersiz mail"
        //-mail @gmail.com icermiyorsa "mail gmail olmalı"
        //-mail @mail.com ile bitmiyorsa "mailde yaım hatası var" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen mailinizi giriniz");
        String girilenmail=scan.nextLine();

        if (!(girilenmail.contains("@"))) {
            System.out.println("geçersiz mail");
        }else if (!(girilenmail.contains("@gmail.com"))){
            System.out.println("mail gmail olmalı");
        }else if (!(girilenmail.endsWith("@mail.com")))
            System.out.println("mailde yaım hatası var");
    }
}
