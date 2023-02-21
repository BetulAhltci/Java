package day12_MethodCreation;

public class C04_Faktöriyel {
    public static void main(String[] args) {

        //verilen bir sayının 15 den küçük bir pozitif tamsayı olduğunu kontrol edin
        //kücükse bir metod oluşturup faktöriyel değerini yazdırın
        //sayı isenilen aralıkta değilse uyarı yazdırın

        int input= 12;
        if (input>0 && input<15){
            faktoryelYazdir(input);
        } else {
            System.out.println("Girilen sayi 15'den kucuk pozitif tamsayi olmalidir");
        }
    }

    public static void faktoryelYazdir(int sayi){
        int faktoryelSonucu=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelSonucu *= i; // her loop'da gelen sayiyi onceki deger ile carpalim
        }
        System.out.println("Girilen " + sayi + " icin faktoryel : " + faktoryelSonucu);
    }
}