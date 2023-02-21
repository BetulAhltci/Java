package day27Overriding;

public class FChild extends EParend {

    @Override
    protected void method1() {
        super.method1();

        //eğer overridding method ile overrdden method da calışsın istersek
        //override
    }


    protected void method2() {
        super.method2();
    }

    public void method3(){
        System.out.println("Child method3");

        //parent class da aynı isimde method olmasına rağmen override olarak görünmedi
        //sebep: parent deki method privite access modifire
    }
}
