package day16_Arrays;

import java.util.Arrays;

public class C13_BinarySearch {
    public static void main(String[] args) {
        //Binary tree javanın kullandığı özel bir sıralama yöntemidir
        //binarysearch metodu bineary tree öelliğini kullandığından
        //sıralı olmayan array'lerde doğru sonuç döndürmeyebilir
        //eğer binarysearch() metodu kullanılacaksa
        //öncesinde MUTLAKA sort() kullanılmalıdır

        int[]arr={2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 3));//2. index

    }
}
