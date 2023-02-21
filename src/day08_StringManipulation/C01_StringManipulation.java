package day08_StringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdiri

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String girilengun= scan.next();
        String kullanılacakgün= girilengun.toLowerCase();

        /* string ifadeler case sensitive'dir
        kullanıcının Pazar, pazaR...gibi 32 farklı sekilde yazma ihtimali vardır

        kullanıcının girdiği değeri  kalıcı olarak değiştirmek tercih edilmez
        kullanıcın girdiği değeri değiştirip yeni bie variable ye atama yapar ve kodlarda yeni olanı kullanır

        konsola yazdıracağımız zaman istersek kullanıcının girdiği orjinal metni
         istersek çevirdiğimiz halini kullanırız
         */

        switch (kullanılacakgün){
            case "pazartesi":
                System.out.println(girilengun + "çalışma zamanı, tatile 5 gün var");
                break;
            case "sali":
                System.out.println(girilengun + "çalışma zamanı, tatile 4 gün var");
                break;
            case "carsamba":
                System.out.println(girilengun + "çalışma zamanı, tatile 3 gün var");
                break;
            case "persembe":
                System.out.println(girilengun + "çalışma zamanı, tatile 2 gün var");
                break;
            case "cuma":
                System.out.println(girilengun + "çalışma zamanı, tatile 1 gün var");
                break;
            case "cumartesı":
            case "pazar":
                System.out.println("şimdi dinlenme zamanı");
                break;
            default:
                System.out.println("yanliş gün ismi");
        }

    }

}
