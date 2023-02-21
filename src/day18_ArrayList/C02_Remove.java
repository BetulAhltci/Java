package day18_ArrayList;

import java.util.*;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));//true Z'yi bulup siler ve görevi tamamladığı için true döner
        System.out.println(harfler);//[A, T]

        System.out.println(harfler.remove(0));//A
        //0. indez deki elementi siler ve görevi tamamlayıp silnen elementi döner

        System.out.println(harfler);//[T]

        List<String> yenilist= new ArrayList<>();
        yenilist.add("C");
        yenilist.add("D");
        yenilist.add("T");
        System.out.println(yenilist.removeAll(harfler));//true
        //harfler listesindeki tüm elementleri yenilisten siler
        //görevi tamamlarsa true, tamamlayamazsa false döner


        System.out.println(yenilist);




    }
}