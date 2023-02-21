package day30_Interfaces_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        //index kullanmadan tüm elementleri 3 arttırın

        for (Integer each:sayilar
             ) {
            System.out.print(each+3+" ");//8 26 5 12 14

        }
        System.out.println("");
        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        //index yapısını kullanmadan tüm elementlerii yazdırın

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5
        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11

        //tek tek değil loop ile yapalım

        System.out.println(itr.hasNext());//false yanında sayı yok

        //Iterayor de geri dönüş yok.nereye gittiyse orda kalır
        //tüm listeyi loop ile yeniden oluşturmak için yeniden bir iterator oluşturulmalı veya
        //iterator a yeni değer atamalıyız

        itr=sayilar.iterator();
        System.out.println(itr.hasNext());//true

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");//5 23 2 9 11

        }

        //iterator kullanarak listede 5'den büyük sayıları silin

        itr=sayilar.iterator();

        while (itr.hasNext()){

            Integer sayi=(Integer)itr.next();
            if (sayi>5){
                itr.remove();

            }
        }
        System.out.println("");
        System.out.println(sayilar);//[5, 2]


    }
}
