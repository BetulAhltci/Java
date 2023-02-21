package day07_Ternary_SwichStatement;

public class C07_nestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayı = 45;
        //System.out.println(sayı>0?"sayı pozitif":"sayı pozitif değil");
        System.out.println(sayı > 0
                ?
                sayı % 2 == 0 ? "çift sayı" : "tek sayı"
                :
                -100 >= sayı && sayı >= -999 ? "3 basamaklı" : "3 basamaklı değil"
                );
        System.out.println(sayı>0
                ? sayı%2==0
                ? "çift sayı" : "tek sayı"
                :
                -100 >= sayı && sayı >= -999 ? "3 basamaklı": "üç basamaklı deği"
                );
    }
}
