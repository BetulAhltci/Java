package day16_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //verilen bir String arra'de
        //istenen bir harfi içeren kelimeleri silip yerine null yazdırın

        String[] isimler={"huseyin","yusuf","memet","akile","said"};
        String silinecekharf="u";

        for (int i = 0;i < isimler.length; i++) {
            if(isimler[i].contains(silinecekharf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler));//[null, null, memet, akile, said]
    }
}
