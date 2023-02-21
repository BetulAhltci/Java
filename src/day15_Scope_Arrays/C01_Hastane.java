package day15_Scope_Arrays;

public class C01_Hastane {
    static String hastaneIsmi = "Yıldız Hastanesi";
    static String hastaneAdres = "Çankaya/Ankara";

    String personelismi;
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {

        /*
        eğer tüm metodlarda kullanılabilecek variable lar oluşturmak isterseniz
        bunları class level de oluştururuz.

        Clas levelde oluşturulacak variable lar için 2 ihtimal vardır
        1-Statik variables(Class variable)
        2-Instance (statik olmayan) variables (obje variables)

        Kural 1- statik variable lar tüm objeler için tek bir değer alır
                instance variable lar her obje için java tarafından coğaltılır

        Kural 2- Class level variables lara değer atamasak da kullanabiliriz
                bizdeğer değer atamasak bile java class level variable lara default değerler atar
                non-primitive==>null
                sayısal primitice==>0
                char ==> hiçlik ""
                bolean==>false

        Kural 3-static olan method'lardan static olmayan variable ve method'lara direk ulasilmaz
                  instance variable ve static olmayan method'lari static alanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.
        Kural 4- class'da olusturulan instance variable'lar ilk deger atamasini yapar
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                  deger atanmamissa default degerleri alir
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class level'daki instance variable'a degil, java tarafindan olusturulup
                  objeye yapistirilan kopya variable'a yapilir
        Kural 5-Statik variable lar tümobjeler için ortakdır
                statik variable lara tüm class dan ulaşılabilir
                statik vriable ın değeri değişirse üm objeler için değişmiş olur
         */

        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.personelismi);//null
        System.out.println(per1.personelTel);//null

        //System.out.println(personelismi);
        per1.personelAdresi = "turkiye";
        per1.personelismi = "ayşe";
        per1.personelTel = "12334566";

        C01_Hastane per2 = new C01_Hastane();
        System.out.println(per2.personelismi);//null;

        per1.personelismi = "yusuf";//ayşe yerine yusuf atar
        System.out.println(per2.personelismi);//null
        per2.personelismi = "ayten";//null değerini ayten yapar
        System.out.println(per2.personelismi);//ayten


        System.out.println(hastaneIsmi);
        System.out.println(per1.hastaneIsmi);


    }

    public static void methodi() {
        System.out.println(hastaneIsmi);
    }

    public void method2() {
        System.out.println(hastaneIsmi);


    }
}
