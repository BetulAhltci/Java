package day23_DateTime_Varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Argüment olaraktamsayılar alıp
        ilk argüment haric geriye kalanları toplatıp
        bulunan toplamı ilk argüment ile çarpıp sonucu yazdıran bir metod oluşturun
        not: argüment sayısı değişken olabilir
         */

        işlemYap(3,4,5,12);
    }

    private static void işlemYap(int ilksayı,int...geriyekalanlar) {

        int geriyeKalanlarToplamı=0;
        for (int each:geriyekalanlar
             ) {
            geriyeKalanlarToplamı+=each;

        }
        System.out.println(geriyeKalanlarToplamı*ilksayı);

    }
}
