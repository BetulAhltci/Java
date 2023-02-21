package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Set {
    public static void main(String[] args) {
        //Java da bir cok yapıda get()ve set()metodları bulunur,
        //get metodları bilgiyi bize getirirken
        // set metodları bilgiyi update (günceller) eder

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);//[A, Z, T]

        //2.index e F elemanını ekle
        //add metodu varolan listeden herhangi bir elementi değiştirmeden
        //istediğimiz elementi ekler

        harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]

        //set metodunda var olan deger silinie yerine yeni değer atanır
        //element sayısı artmaz

    }
}
