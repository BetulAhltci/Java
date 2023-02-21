package day07_Ternary_SwichStatement;

public class C06_sorular {
    public static void main(String[] args) {
        //kullanıcıdan notu alın
        //50 veya daha büyükse "sınıfı geçtin"
        // 50 drn küçükse " kaldın" yazdır

        int input=54;
        System.out.println(input>=50?"sınıfı geçtin":"kaldın");


        //kullanıcıdan bir harf alın
        //küçük harf ise büyük harf olarak
        //yoksa girilen harfi yazdırın

        char krk='a';
        System.out.println(krk>='a'&& krk<='z'?(char)(krk-32):krk);

        //kullanıcıdan bir sayı alın ve mutlak değerini yazdırın

        input=-8;//|-8|=(-1)*(-8)

        System.out.println(input>0?input:(-1)*input);

    }
}
