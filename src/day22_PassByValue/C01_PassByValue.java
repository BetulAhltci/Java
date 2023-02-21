package day22_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
         verilen bir List'de degisiklik yapan 2 method olusturun
        1.method list'in elementlerine yeni deger atayip yazdirsin
        2.method, list'e yeni bir list degeri atayip, yeni list'e
          elementler ekleyip yazdirsin
        her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim
         */
        List<Integer> sayılar= new ArrayList<>();
        sayılar.add(10);
        sayılar.add(34);
        sayılar.add(45);
        System.out.println(sayılar);//[10, 34, 45]

        elemanlarıdeğiştir(sayılar);

        System.out.println("1. metod call dan sonra sayılar: "+ sayılar);// [25, 54, 67]

        yeniListAta(sayılar);

        System.out.println("2. metod call dan sonra sayılar: "+sayılar);// [25, 54, 67]

        /*
        Java PassByValue kullanır
        PassByValue, meoda gönderilen variable ın kendisini değil değerini göndermek demektir
        Prmitive data türleri vey String gönderdiğimizde, metod da yapılan değişiklik metod da kalır
        main metod da atama yapılmadıkca main metoddaki variable ın degeri DEĞİŞMEZ

        PassByValue coklu element içeren array ve List gibi ypılariçinde GEÇERLİDİR
        Ancak coklu elementi value olarak metoda göndermediğinden array ve list in adresini gönderir

        Eger method'da elementlere atama yapilirsa, main method'daki elementler de degismis olur
        Eger list veya array'e yeni bir list veya array degeri atanirsa bu atama method'da kalir,
        main method'daki list veya array degismez.

         Araba ayni kaldigi muddetce icindekilerin degismesi passByValue'e aykiri degildir.

         */

    }
    public static void elemanlarıdeğiştir(List<Integer>sayılar){
        sayılar.set(0,25);
        sayılar.set(1,54);
        sayılar.set(2,67);
        System.out.println("elemanları değiştir metodunda list: "+sayılar);//[25, 54, 67]
    }

    public static void yeniListAta(List<Integer>sayılar){
        sayılar= new ArrayList<>();
        sayılar.add(34);
        sayılar.add(98);
        sayılar.add(11);
        System.out.println("yeni list ata meytodunda sayılar list inin son hali: "+sayılar);
    }


}
