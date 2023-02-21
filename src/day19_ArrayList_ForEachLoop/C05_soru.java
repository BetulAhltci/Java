package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_soru {
    public static void main(String[] args) {
        //Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.


        Integer[] arr = {2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4};

        List<Integer> list1 = new ArrayList<>();

        for (Integer each : arr
        ) {
            if (!list1.contains(each)) {
                list1.add(each);
            }
        }
        //list olarak unıque değerlerden olşan bir list luşturduk

        arr = new Integer[list1.size()];

        //şimdi listdeki elementleri array e kopyalıyalım
        //array e atama yapmak

    }
}
