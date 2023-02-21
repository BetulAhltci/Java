package day28_Exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentExceptions {
    public static void main(String[] args) {

        //Kullanıcıdan yasını girmesini isteyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas=scan.nextInt();
        try {
            if (yas<0){
                throw new IllegalArgumentException("hata");
            }else {
                System.out.println("yasınız kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
