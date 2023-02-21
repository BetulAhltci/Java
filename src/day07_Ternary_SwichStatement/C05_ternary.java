package day07_Ternary_SwichStatement;

public class C05_ternary {
    public static void main(String[] args) {
        /*
        ternary işleminin sonucu yazdıracaksak boolean şartın
        true ve false olması durumunda yazdıracağımız datakar farklı data türünde olabilir

        ancak atama yapacaksak true veya false olması durumunda alacağı değerler
        atanacak variable ın data türüne uygun olmaıdır
         */

        int sayı=2;
        System.out.println(sayı>10?"büyük sayı":sayı+2);
       // int b= sayı>10?"büyük sayı":sayı+2;
       // String b=sayı>10"büyük sayı":sayı+2;

    }
}
