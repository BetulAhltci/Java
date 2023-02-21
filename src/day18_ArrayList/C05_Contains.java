package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Contains {
    public static void main(String[] args) {
        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7};

        List<Integer> sayılar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayılar.add(arr[i]);
        }

        System.out.println(sayılar);//[4, 3, 6, 7, 3, 5, 3, 6, 7, 3, 5, 4, 6, 4, 7, 7, 7]

        System.out.println(sayılar.contains(2));//false
        System.out.println(sayılar.contains(4));//true
    }
}
