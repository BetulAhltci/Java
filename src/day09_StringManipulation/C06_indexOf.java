package day09_StringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        //kullanıdan aldığınız cümlede "cok" ile başlayan ilk kelimeyi yadırın
        //cümlede cok gecmiyorsa "cümlede cok ile başlayan kelime yok" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String girilencumle=scan.nextLine();

        //Sınavlarımızd coktan seçmeli sorular kullanıyoruz
        //Java yı cok seviyoruz
        //Bu kadar coklu seçenek olur mu?

        if(!(girilencumle.contains("cok"))){
            System.out.println("cumlede cok ile baslayan kelıme yok");
        }else{
            int cokIndex=girilencumle.indexOf("cok");
            int boslukindex=girilencumle.indexOf(" ",cokIndex+1);

            System.out.println(girilencumle.substring(cokIndex,boslukindex));
        }






    }
}
