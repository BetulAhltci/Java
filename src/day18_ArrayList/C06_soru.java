package day18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //verilen bir array deki tekrar eden elementleri silip
        //arrayı uniqu değerlerden olusan bir array haline getirin

        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElemenlerList=new ArrayList<>();

        //array deki tüm elementleri listede varmı diye kontrol edelim olmayanları ekleyelim

        for (int i = 0; i <arr.length ; i++) {

            if(!benzersizElemenlerList.contains(arr[i])){

                benzersizElemenlerList.add(arr[i]);
            }

        }
        System.out.println(benzersizElemenlerList);//[4, 3, 6, 7, 5]

        //soruda bu değerleri arr ye atamamızı istiyor

        arr= new int[benzersizElemenlerList.size()];//[0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= benzersizElemenlerList.get(i);
        }
        System.out.println("Array in son hali: "+ Arrays.toString(arr));//Array in son hali: [4, 3, 6, 7, 5]

    }

}
