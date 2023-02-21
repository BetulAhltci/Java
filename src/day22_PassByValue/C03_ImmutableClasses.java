package day22_PassByValue;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";

        str=str.replace("J","H");
        System.out.println(str);//Hava

        str=str.toLowerCase();
        System.out.println(str);//hava

        //Aşağıdaki oble çalışırsa Java kaç obje oluşturur

        String a="ABC";//1. obje
        for (int i = 0; i < 10; i++) {
            a=a+i;// 10 tane obje
        }
        System.out.println(a);//ABC0123456789 toplam 11 obje oluşturur en sonuncuyu kullanır
    }
}
