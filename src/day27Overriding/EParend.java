package day27Overriding;

public class EParend extends DGrandParent{

    @Override
    protected void method1() {
        super.method1();

        //@override notasyonu overriden method ile overriding methodu ilişkilendirir
        //eğer
    }

    protected void method2(){
        System.out.println("P method2");
    }
    private void method3(){
        System.out.println("P method3");
    }
}
