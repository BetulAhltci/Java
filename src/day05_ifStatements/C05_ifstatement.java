package day05_ifStatements;

import java.util.Scanner;

public class C05_ifstatement {
    public static void main(String[] args) {
        /* kullanıcan bir harf alın
        o harfle başlayan bir ay varsa yazdırın
        buyuk harf küçük har hassasiyeti olmasın
        kullanıcı o veya O girdiğinde output ocak olsun
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yazdırmak istediğiniz ayın ilk harfini girin");
        char ilkharf= scan.next().charAt(0);

        if(ilkharf=='o'|| ilkharf=='O') System.out.println("Ocak");
        if (ilkharf=='s'|| ilkharf=='S') System.out.println("Subat");
        if (ilkharf=='m'|| ilkharf=='M') System.out.println("mart veya mayıs");
        if(ilkharf=='n'|| ilkharf=='N' ) System.out.println("nisan");
        if(ilkharf=='h'|| ilkharf=='H') System.out.println("haziran");
        if (ilkharf=='t'||ilkharf=='T') System.out.println("temmuz");
        if (ilkharf=='a'||ilkharf=='A') System.out.println("ağustos veya aralık");
        if (ilkharf=='e'||ilkharf=='E') System.out.println("eylül veya ekim");



    }
}
