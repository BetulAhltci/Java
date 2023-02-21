package day23_DateTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//12:07:12.910870600

        System.out.println(zaman.getMinute());//8

        System.out.println(zaman.withSecond(0).withNano(0));//12:09

        System.out.println(zaman.withSecond(1).withNano(1));//12:09:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250));//20:20:39.631212700

        //bir for loop ile 1 den 10000 e kadar olan sayıları yanyana yazdırın
        //bu işlem için geçen süreyi bulun

        LocalTime başlangıczamanı=LocalTime.now();

        System.out.println("başlangıç "+başlangıczamanı);

        for (int i = 0; i <=10000 ; i++) {

            System.out.print(i+" ");
        }
        LocalTime bitişzamanı=LocalTime.now();

        System.out.println("");

        System.out.println("bitiş "+bitişzamanı);

        System.out.println("işlem süresi "+
                (bitişzamanı.getNano()-başlangıczamanı.getNano())+
                        " nanosaniye");//işlem süresi -812505100nanosaniye

        /*
         Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
         olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

         ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
          yeni bir time veya date objesi olusturup
          o andaki degeri alabiliriz.
         */


    }
}
