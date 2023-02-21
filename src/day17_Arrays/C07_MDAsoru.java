package day17_Arrays;

import java.util.Arrays;

public class C07_MDAsoru {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
         yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
         */

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] toplamlarArray = new int[arr.length];//[0, 0, 0, 0, 0]
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[1].length; j++) {

                toplam += arr[i][j];
            }
            toplamlarArray[i] = toplam;
            toplam = 0;

        }
        System.out.println(Arrays.toString(toplamlarArray));
    }







    }








