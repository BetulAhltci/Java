package day30_Interfaces_Iterator;

import day29_final_abstractClasses.FChild;

public class M01_ChildofInterface implements I01_Interface,I02_Interface {

    //Bir class baska bir classı extends keyworld ile parent edinebilir.
    //Ancakbieden fazla class ı parend EDİNEMEZ.
    //
    //
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI1);
       // I01_Interface.SAYI2=8; variable lar final oldugundan değer atanmaz


    }

    /*
    Eğer birden fazla interface implement edildiğinde aynı isimde methodlar farklı interfacelerde varsa
    return type bakılır.
    return type aynı ise sorun olmaz,cunku ikisinide implement edebiliriz
    Ancak return type ları farklı ise
     */




    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }



}
