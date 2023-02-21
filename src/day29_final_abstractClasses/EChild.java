package day29_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parend class'daki mecburi override edilecek method1'i override ettik");
    }

    @Override
    public void method2() {
        System.out.println("parend class'daki mecburi override edilecek method2'i override ettik");
    }


    /*
    Klasik inheritance ile child ilişkisi oluşturduğumuzda parend class daki tüm özellikleri otomatik olarak kazanırız
    ancak methodları override etme MECBURİYETİ YOKTUR
    Ister override edip edip kendimize özelleştiririz, istersek de parent class daki haliyle kullanabiliriz
     */

    public static void main(String[] args) {
        //DParent obj1=new DParent();
        //Abstract class'ların constructor ı vardır ama OBJE ÜRETİLEMEZ

           EChild child1=new EChild();
           child1.method1();//parend class'daki mecburi override edilecek method1'i override ettik
           child1.method2();//parend class'daki mecburi override edilecek method2'i override ettik
           child1.method3();//Parend class'daki method calıştı

        DParent child2=new EChild();
        child2.method1();
        child2.method2();
        child2.method3();
    }
}
