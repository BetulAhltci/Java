package day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //verilen bir String Array in tüm elementlerini yazdırın

        String[] isimler={"hüseyin","yusuf","memet","akile","said"};

        System.out.println(Arrays.toString(isimler));//[hüseyin, yusuf, memet, akile, said]

        for (int i = 0; i < isimler.length ; i++) {

            System.out.print(isimler[i]+" ");
        }
        //hüseyin yusuf memet akile said

    }
}
