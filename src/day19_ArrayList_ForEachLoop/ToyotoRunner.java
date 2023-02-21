package day19_ArrayList_ForEachLoop;

public class ToyotoRunner {
    public static void main(String[] args) {


        Toyota toyota1 = new Toyota();
        System.out.println(toyota1.marka+", "+
                            toyota1.model+", "+
                            toyota1.km+" ,"+
                            toyota1.renk+", "+
                            toyota1.yıl);//Toyota, Model belirtilmemiş, 0 ,null, 0

        toyota1.model="Corolla";
        toyota1.yıl=2020;
        toyota1.km=5000;

        System.out.println(toyota1.marka+", "+
                toyota1.model+", "+
                toyota1.km+" ,"+
                toyota1.renk+", "+
                toyota1.yıl);//Toyota, Corolla, 5000 ,null, 2020




    }

}
