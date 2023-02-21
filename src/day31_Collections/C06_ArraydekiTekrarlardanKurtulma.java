package day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        //verilen arraydeki tekrar eden elementleri sadece bir kere yazarak arrayı kısaltın

        int[] arr={1,2,3,5,4,2,3,4,6,1,3,6,5,2,4,3,2,1,6,5,};

        Set<Integer> arrSet=new HashSet<>();
        //arraydeki tüm elementleri Set'e ekleyelim

        for (int each:arr
             ) {
            arrSet.add(each);

        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]

        //Set'deki element sayısına eşit bir array ollusturup
        //Setteki elementleri oraya tasıyın

        arr=new int[arrSet.size()];//[0, 0, 0, 0, 0, 0]

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println("Arrayin son hali: "+ Arrays.toString(arr));//Arrayin son hali: [1, 2, 3, 4, 5, 6]



    }
}
