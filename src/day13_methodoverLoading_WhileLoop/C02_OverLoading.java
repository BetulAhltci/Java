package day13_methodoverLoading_WhileLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

        String str="Java cok güzel";
        System.out.println(str.substring(5));//cok güzel
        System.out.println(str.substring(3,5));//a

        //eğer seçtiğimiz isimde birden fazla metod varsa buna Over Loading denir.
        //aynı isimdeki metodlardan hangisinin calışacağına argüment/parametre uyumu karar verir
        //OverLoading aynı isimde ama farklı işleve sahip metodlar olusturmak demektir

        toplama(2.5,8.5);//11

    }

    public static void toplama(int sayı1,int sayı2){
        System.out.println("2 tam sayının toplmı:"+(sayı1+sayı2));
    }

    public static void toplam(int sayı1,int sayı2,int sayı3){
        System.out.println("3 tam sayının toplamı:"+(sayı1+sayı2+sayı3));

    }

    public static void toplama(double sayı1,int sayı2){
        System.out.println("double ve int toplamı:"+(sayı1+sayı2));
    }

    public static void toplama(int sayı1, double sayı2){
        System.out.println("int ve double toplamı:"+(sayı1+sayı2));
    }
    public static void toplama(double sayı1, double sayı2){
        System.out.println("2 double sayı toplamı:"+(sayı1+sayı2));
    }


}
