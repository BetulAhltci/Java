package day21_statikKeyworld;

import java.util.Arrays;

public class C06_PassByValueÇokluElement {
    public static void main(String[] args) {

        int[] arr={3,6,8};
        //bir metod oluşturun
        //metod da array e 5 elementli yeni bir array atayın ve yazdırın
        //main metoda döndükten sonra array i tekrar ydırın

        arrayiDeğiştir(arr);

        System.out.println(Arrays.toString(arr));//[3,6,8]

    }

    public static void arrayiDeğiştir(int[] b){

        b=new int[5];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0]
    }

}
