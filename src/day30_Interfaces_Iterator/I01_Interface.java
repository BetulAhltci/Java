package day30_Interfaces_Iterator;

public interface I01_Interface {

    //Interface'lerde tüm methodlar interfacedir
    //Interfac'lerde tüm variable lar PUBLIC,STATIC,FINAL'dır
    //
    int SAYI1=10;
    public static final String okulIsmi="Yıldız Koleji";
    public int SAYI2=20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();

     public default void method44(){

     }
}
