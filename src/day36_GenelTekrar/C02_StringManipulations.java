package day36_GenelTekrar;

public class C02_StringManipulations {
    public static void main(String[] args) {
        //verilen bir cümlede istnen kelimenin kackere gectiğini bulup yazdıran bir method olusturun

        String cumle="Java basladıve bitti. Java meğer ne güzelmiş. Ne phyton ve ne C, Java en iyisi";
        String istenenkelime="Java";


        kullanimSayisiBul(cumle,istenenkelime);
        kullanimSayisiBul2(cumle,istenenkelime);
        kullanimSayisiBul3(cumle,istenenkelime);
    }

    private static void kullanimSayisiBul3(String cumle, String istenenkelime) {
        //Java buldukca silerek yapıldı
        //ama jajavaja varsa buradan iki java buluyor
        //bunu yerine hiçlik değil _ kullandık ve sorun cözoldu


        int kullanımsayisi = 0;

        while (cumle.contains(istenenkelime)) {
            kullanımsayisi++;
            cumle = cumle.replaceFirst(istenenkelime,"-");
            if (kullanımsayisi == 0) {
                System.out.println("cümlede aranan kelime yok");
                System.exit(0);
            } else {
                System.out.println("Kelime cümlede " + kullanımsayisi + " adet kullanılmıstır");
                System.exit(0);

            }

        }
    }

    private static void kullanimSayisiBul2(String cumle, String istenenkelime) {
        //for loop ve substring ile cözüm
        int kullanimsayisi=0;
        for (int i = 0; i <= cumle.length(); i++) {
            if (cumle.substring(i,i+istenenkelime.length()).equals(istenenkelime)){
                kullanimsayisi++;
            }
        }
    }

    private static void kullanimSayisiBul(String cumle, String istenenkelime) {
        int kullanimsayisi=0;
        int index=0;

        while (index<cumle.length()) {

            index = cumle.indexOf(istenenkelime, index);
            if (index == -1) {
                if (kullanimsayisi == 0) {
                    System.out.println("cümlede aranan kelime yok");
                    System.exit(0);
                } else {
                    System.out.println("Kelime cümlede " + kullanimsayisi + " adet kullanılmıstır");
                    System.exit(0);
                }

            } else {
                kullanimsayisi++;
                index++;
            }
        }






    }
}
