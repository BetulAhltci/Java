package day06_ıf_else_statement;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        /*kullanıcıdan yaşını yaşını ve cinsiyetini alın
        kadın 60 yaş ustu erkek 65 yaş üstu olabilir
        cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        veya  "emekli olmak için ... yıl daha çalışman gerek" yazdır
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("cınsıyetınızı gırınız\n K:kadın, E:Erkek");
        char cınsıyet = scan.next().charAt(0);

        System.out.println("lütfen yaşınızı tam sayı olarak giriniz");
        int yas= scan.nextInt();

        if((cınsıyet=='K' || cınsıyet=='k') && yas>=60 && yas<80){
            System.out.println("emekli olabilir");}
        else if ((cınsıyet=='K' || cınsıyet=='k') && yas>=18 && yas<80){
            System.out.println("emekli olmak için"+(60-yas)+"yıl daha çalısmalısın");}
        else if ((cınsıyet=='E' || cınsıyet=='e') && yas>=65 && yas<80){
            System.out.println("emekli olabilir");}
        else if ((cınsıyet=='E' || cınsıyet=='e') && yas>=18 && yas<80){
            System.out.println("emekli olmak için"+(65-yas)+"yıl daha çalısmalısın");}
        else{
            System.out.println("geçersiz bilgi");}



        }
    }

