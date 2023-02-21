package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,3,4,6,1,8,5,4};
                /*
                verilen bir arrayi List e cevirmek için 2 yöntem vardır
                1-bir loopile tü elementleri List e kopyalamak
                2-asList() metodunu kullanmak ama bu çok tavsiye edilmez
                  cünkü iki büyük deavantajı vardır.
                  -asList ile oluşturulan list arrayden olusturulduğu için add, remove gibi size ı değiştiren
                    metodlar kullanılmaz
                  -asList() ile oluşturulan list ile bağlı
                 */

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println("loop ile taşınan list:  "+list1);


        List<Integer> list2=new ArrayList<>();
        System.out.println("asList ile oluşan list: "+list2);
        //list2.add(6);
    }
}
