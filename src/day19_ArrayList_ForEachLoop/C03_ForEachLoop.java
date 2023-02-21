package day19_ArrayList_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
        Eğer coklu element içeren bir yapıdaki tüm elementlere aynı işlemi yaomak istiyorsak
        indexden bağimsız olarak for each loop kullanılabilir

        for each loop da üç seyi belirtmemiz gerek
        1-getirilecek elementlerin data türü
        2-getirilecek elemente verilecek isim(genelde each veya w kullanılır
        3-nereden getireleceği
         */


        int[] arr={2,4,6,8,1};

        //bu array deki tüm elementleri yazdıralım

        for (int each: arr
             ) {
            System.out.print(each+" ");
        }
        System.out.println();

        //tüm elementleri toplayalım

        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("sayıların toplamı: "+toplam);

        System.out.println();

        //tüm sayıların kareleri toplamı

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("sayıların kareleri toplamı: "+toplam);

    }
}
