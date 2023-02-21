package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayılar= new ArrayList<>();

        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);

        System.out.println(sayılar);//[10, 5, 7, 9]

       // sayılar.remove(5);
        /*
        eğer listemiz integerlardan oluşuyorsa
         parametre olarak girdiğimiz sayının index mi yoksa silmek isrediğimiz objemi olduğu
         belirsiz olmasın diye
         index otomatk olarak girilen sayıyı index kabul eder

         Eğer integer lardan oluşan bir listede bir listede obje olarak bir elementi silmek isterseniz
         önce onu tanımlarsınız
         */

        Integer silinecekElement=5;
        System.out.println(sayılar.remove(silinecekElement));//true
        System.out.println(sayılar);//[10, 7, 9]

        Integer slinecekElement=20;
        System.out.println(sayılar.remove(slinecekElement));//false


    }
}
