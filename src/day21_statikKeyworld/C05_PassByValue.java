package day21_statikKeyworld;

import java.util.Arrays;

public class C05_PassByValue {
    public static void main(String[] args) {

        int[] arr={3,6,9,1,7};

        //bir metod olusturp arr yi metoda yollayalım
        //metod da arr in elementleri üzerinde değişiklik yapalımve arr yi yazdıralım

        elementleriDegistir(arr);//[13, 6, 19, 1, 7]

        System.out.println(Arrays.toString(arr));//[13, 6, 19, 1, 7]

    }
    public static void elementleriDegistir(int[] b){
        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));//[13, 6, 19, 1, 7]

    }

}
