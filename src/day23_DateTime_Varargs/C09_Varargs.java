package day23_DateTime_Varargs;

public class C09_Varargs {
    public static void main(String[] args) {
         /*
        Argüment olaraktamsayılar alıp
        ilk argüment haric geriye kalanları toplatıp
        bulunan toplamı son argüment ile çarpıp sonucu yazdıran bir metod oluşturun
        not: argüment sayısı değişken olabilir
         */

       // işlemYap(3,4,5,12);
        /*
        Varargs sınırsız sayıda element alma özelliğine sahiptir
        dolayısıyla Varargs olarak tanımlanan bir parametreden sonra parametre kullanılırsa CTE olur

        KURAL: Bir metodda parametre olarak varargs kullanılacaksa son parametre olarak kullanmalıdır

                Bu kural göz önüne alındığında bir metodda birden fazla varargs kullanılmaz
                Parametrelerin data türü bu kuralı etkilemez
         */


    }



    private static void işlemYap(int...geriyekalanlar) {

        int geriyeKalanlarToplamı=0;


    }


}
