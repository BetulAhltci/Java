package day21_statikKeyworld;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Java PassByValue kullanır
        yani metodlar rasında gönderilen variable ların kendiileri değil
        value(değer) gönderilir

         */

        int fiyat =100;

        //fiyat üzerinden %10 indirim yapıp, indirimli fiyatı döndüren bir metod oluşturun

        System.out.println(indirimYap10(fiyat));//90

        System.out.println(fiyat);//100

        //eğer indirimli fiyatın kalıcı olarak fiyatımızı değiştirmesini istersek atama yaparız

        fiyat=indirimYap10(fiyat);

    }

    public static int indirimYap10(int a){

        a=a*90/100;

        return a;
    }

}
