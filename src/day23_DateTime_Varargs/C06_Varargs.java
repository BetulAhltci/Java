package day23_DateTime_Varargs;

public class C06_Varargs {
    public static void main(String[] args) {

        //öle bir metod oluşturalım ki
        //kaç tane argüment girersek girelim
        //argümentleri toplamını yazdırsın

        topla(5,6);//11
        topla(5,8,2);//15
        topla(4,6,2,9,3,4,8,1,2);//39

        /*
        Varargs array altyapısını kullanır
        Temel hedef argüment sayısı değişse bile
        aynı data türündeki tümargümentleri alabilecek bir parametre oluşturmaktır
         */

    }

    private static void topla(int... sayılar) {

        int toplam1=0;
        for (int i = 0; i < sayılar.length; i++) {
            toplam1+=sayılar[i];
        }
        System.out.println(toplam1);

        int toplam2=0;
        for (int each:sayılar
             ) {
            toplam2+=each;
        }
        System.out.println(toplam2);
    }
}
