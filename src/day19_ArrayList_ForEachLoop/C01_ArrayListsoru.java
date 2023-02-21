package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayListsoru {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("tam bölenlerini listelemek için pozitif bir sayı giirin");

        int girilensayi=scan.nextInt();

        if (girilensayi<=0){
            System.out.println("gecersiz sayı");
        }else{
            List<Integer> tamBölenlerListesi=tamBolenlerListesiOluştur(girilensayi);
            System.out.println(tamBölenlerListesi);
        }

    }

    public static List<Integer> tamBolenlerListesiOluştur(int girilensayi) {

        List<Integer> tamBölenlerListesi = new ArrayList<>();

        for (int i = 1; i <=girilensayi ; i++) {

            if (girilensayi%i==0){
                tamBölenlerListesi.add(i);

            }
        }
        return tamBölenlerListesi;


    }


}
