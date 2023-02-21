package day16_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //verilen bir int array deki tüm elementleri 5 arttırın

        int[] arr={2,4,6,8};

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=5;
        }
        System.out.println(Arrays.toString(arr));//[7, 9, 11, 13]
    }
}
