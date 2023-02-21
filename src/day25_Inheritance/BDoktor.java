package day25_Inheritance;

public class BDoktor extends APersonel{

        /*
        Oluşturduğumuz doktor class ında isim soyisim gibi
        personel class ında oluşturulan tüm özelliklerin olmasını istiyoruz

        1-Istenen tüm özellikleri doktor classında tekrar oluşturabiliriz
        2-Doktor classını personelin child ı yapabiliriz

        Doktor class ını personel classının child ı yaptığımızda
        Doktor class'ından oluşturulan objeler sadece kendi calass'larındaki özelliklere sahip olmaz
        aynı zamanda parent class ı olan personel deki özelliklerede sahip olur

        Bir child class'dan obje oluşturduğumuzda o objenin özelliklerini belirlerken
        önce kendi class ına bakılır ve o özellik varsa kullanılır
        yoksa parend class'a bakılır

        Bir class extends keyword kullanarak başk bir classı kendine parent edinirse
        1- Parent class'daki

         */
        public static void main(String[] args) {

            BDoktor dok1=new BDoktor();
            dok1.isim="Kemal";
            dok1.soyisim="Bulut";

            System.out.println(dok1.isim+" "+dok1.soyisim+" "+dok1.telefon);
            //Kemal Bulut Telefon atanmadı

        }





}
