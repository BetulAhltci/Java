package day08_StringManipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {
        String str = "Java her geçen gün daha da güzelleşiyor, değil mi?";

        //sondan 3. karakteri yazdırın
         System.out.println(str.charAt(str.length()-3));//m

        System.out.println(str.length());



        //Rastgele bir karakterini yazdıralım

        Random rnd= new Random();//rnd değeri için 0 ile 1 arasında rastgele bir değer oluşturur
        int index= rnd.nextInt(str.length());//str.length() den kücük rastgele bir int üretir

        System.out.println(str.charAt(index));




    }
}


