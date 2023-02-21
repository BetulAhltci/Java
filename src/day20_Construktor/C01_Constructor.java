package day20_Construktor;

import day19_ArrayList_ForEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {


        Car car1 = new Car();
        Toyota toyota = new Toyota();
        System.out.println(car1);
        //Car{marka='Marka belirtilmemiş', model='Model belirtilmemiş', yıl=1900, km=0, renk='Renk seçilmeli'}

        System.out.println(toyota);//day19_ArrayList_ForEachLoop.Toyota@4157f54e
        //toyota bir obje olduğundan özelliklerini direk yazdıramayız.referansını yadırır

        //bir class'dan oluşturulan objelerin belirli özelliklerini kolayca yazdırabilmek için
        //o class da istenen özellikleri kapsayan bir toString()oluşturulabilir

        //toString metodunda yazılanları istediğimiz şekil ve formata uyarlayabiliriz

        car1.marka="Audi";
        car1.model="A4";
        car1.yıl=2020;
        car1.km=20000;
        car1.renk="Siyah";

        System.out.println(car1);/*Car{marka='Audi'
                                    , model='A4'
                                    , yıl=2020
                                    , km=20000
                                    , renk='Siyah'}*/




    }
}
