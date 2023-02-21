package day10_StringManipulation;

public class C06_soru {
    public static void main(String[] args) {
        /*Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
         - ilk harf kucuk harf olmali
         - son karakter rakam olmali
         - sifre bosluk icermemeli
         - uzunlugu en az 10 karakter olmali*/


        String sifre="abc1234567";

        /* bu soruda sartları bağımsız if cümleleri veya if else ile yapmak mümkundur

            eğer if-else ile yaparsak ilk hatayı yazdırır geriye kalana bakmaz
            avantajı ise eğerhata yoksa otomatik olarak başarılı sekılde oluşturuldu diyebilir


            bağımsız if cümlelerinde tüm hataları tek seferde söyleyebiliriz
            ancak bağımsız if cümleleri kodun geriye kalanı ile ilgilenmediğinden
            başarılı sifre olluşturulduğunu ayrı bir mekanızma ile kontrol etmeliyiz

         */

        /* sonucda başarılı sıfre olusturuldu demek içinbir kontrol mekanizması olusturmamız gerekir
            ya her adımda arttıracağımız bir sayac yapıp en son 4 oldu ise başarılı deriz
            veya basta verdiğimiz değer olumsuz bir durum olduğunda arttırılır
            en sonda kontrol edip eğer baştakı değeri koruyorsa başarılı kabul edilir
         */

        int flag=0;
        // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            // ilk harf kucuk degilse hatayi yazdir
            // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("Ilk harf kucuk harf olmali");
            flag++; // bir ceza puani aldi
        }
        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            flag++;
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }
        // - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }
    }
}





