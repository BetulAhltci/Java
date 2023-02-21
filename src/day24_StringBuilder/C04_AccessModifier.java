package day24_StringBuilder;

public class C04_AccessModifier {

    String str;
    //AccessModifire yı gözlerimizle göremiyorsak default access modifire var demektir

    //Bu class da default constructor var
    // str ın değeri null(default değer)
    //str ın access modifire ı default access modifire

    public static void main(String[] args) {

        D obj1=new D();
        System.out.println(obj1.isimDefault);//Furkan
        obj1.defaultStaticOlmayanMethod();

        System.out.println(obj1.isimDefaultStatic);//Sevilay
        System.out.println(D.isimDefaultStatic);//Sevilay




    }
}
