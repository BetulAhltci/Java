package day17_Arrays;

import java.util.Arrays;

public class C03_StringSplitMetodu {
    public static void main(String[] args) {

        String str="Java her geçen gün güzelleşiyor";

        //str da kaç kelme var?
        //split metodu istediğimiz stringi istediğimiz ayrac kullanarak
        //parçalara ayırmamıza imkan verir

        String[] Spacesplit =str.split(" ");
        System.out.println(Arrays.toString(Spacesplit));//[Java, her, geçen, gün, güzelleşiyor]
        System.out.println("verilen cümledeki kelime sayısı: "+Spacesplit.length);//5
        System.out.println(Arrays.toString(str.split("e")));//[Java h, r g, ç, n gün güz, ll, şiyor]
        System.out.println(Arrays.toString(str.split("gün")));//[Java her geçen ,  güzelleşiyor]
        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, ç, e, n,  , g, ü, n,  , g, ü, z, e, l, l, e, ş, i, y, o, r]


    }
}
