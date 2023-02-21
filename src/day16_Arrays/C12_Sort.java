package day16_Arrays;

import java.util.Arrays;

public class C12_Sort {
    public static void main(String[] args) {
        //verilen bir array'i Natural Order(doğal sıralama) göre yazdırın

        String[]isimler={"Yuseyin","Yusuf","Memet","Akile","Said","Mahmut","ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));//[Yuseyin, Yusuf, Memet, Akile, Said, Mahmut, ahmet, adnan]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Akile, Mahmut, Memet, Said, Yuseyin, Yusuf, adnan, ahmet]

        //eğer



    }
}
