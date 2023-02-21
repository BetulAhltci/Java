package day24_StringBuilder;

public class D {

    private String isim="Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {
       // System.out.println(isim); static olmadığından main metod içinde direk kullanılmaz

        D obj1=new D();
        System.out.println(obj1.isim);

        staticMetod();
        System.out.println(obj1.isim);
    }

    private void staticOlmayanMetod(){
        isim="Hüseyin";
        System.out.println(isim);

    }

    void defaultStaticOlmayanMethod(){
        System.out.println("default static olmayan metod çalıştı");
    }

    static void defaultStaticMethod(){
        System.out.println("default static metod calıştı");

    }

    private static void staticMetod(){
        D obj1=new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);
    }


}
