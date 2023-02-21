package day30_Interfaces_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        //tüm elementleri index kullanmadan 3 arttırın

        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){
            Integer sayi=(Integer)lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);//[8, 26, 5, 12, 14]

        //Listeyi iterator kullanarak sondan bşa doğru yazdırın
        //bir üstteki loop ile sona gittiğimiz için iteraator suan en sonda.Olmasını istediğimiz yerde

      while (lit.hasPrevious()){
          System.out.print(lit.previous()+" ");//14 12 5 26 8
      }





    }
}
