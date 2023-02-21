package day23_DateTime_Varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        // verilen iki sayıyı toplayıpyazdıran bir metod yazdırın

        topla(5,8);//13
        topla(5,7,3);//15
        topla(7,3,4,6);//20
    }

    private static void topla(int sayı1, int sayı2, int sayı3, int sayı4) {
        System.out.println("Dört sayının toplamı: "+sayı1+sayı2+sayı3+sayı4);
    }

    private static void topla(int sayı1, int sayı2, int sayı3) {
        System.out.println("Üç sayının toplamı:" +(sayı1+sayı2+sayı3));
    }

    private static void topla(int sayı1, int sayı2) {
        System.out.println("İki sayının toplamı: "+(sayı1+sayı2));
    }
}
