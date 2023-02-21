package day13_methodoverLoading_WhileLoop;

public class C03_MetodOverLoading {
    public static void main(String[] args) {

        toplama(5.4,6.3);//2 double sayı toplamı:11.7
        toplama('a','b');//asci değerleriyle işlem yapar /int ve double toplamı:195.0


        //ilk olarak %100 uyumlu parametreler arar
        //eğer tam uyumlu yoksaçalışabilecek metod varmı diye bakar
        //çalışacak metod birden fazla ise minimm casting yaparak kullanabileceğini tercih eder

        toplama(8.4,6);//2 double sayı toplamı:14.4

    }

    public static void toplama(int sayı1, double sayı2){
        System.out.println("int ve double toplamı:"+(sayı1+sayı2));
    }
    public static void toplama(double sayı1, double sayı2){
        System.out.println("2 double sayı toplamı:"+(sayı1+sayı2));
    }


}
