package day20_Construktor;

import java.util.concurrent.Callable;

public class C02_Constructor {
    public static void main(String[] args) {
        /*
        bir obje oluşturulurken istediğimiz özelliikleri direk atayabilirsek
        sonradan tekrar bir atama işlemi yapmaya gerek kalmaz

        bu durumda atamayı tek tek bizim yapmamı yerine constructor ın atama yapmasını istemeliyiz

        atama yapmak için constructor aparametre göndermeliyiz
         */


        Car car1 = new Car("Bmw", "5.20", "beyaz", 15000, 2020);
        System.out.println(car1);/*Car{marka='Bmw'
                                    , model='5.20'
                                    , yıl=2020
                                    , km=15000, renk='beyaz'}*/

        Car car2=new Car("tofaş","şahin",2010);
        System.out.println(car2);
        /*
        Car{marka='tofaş'
            , model='şahin'
            , yıl=2010
            , km=0,
             renk='Renk seçilmeli'}
         */


        Car car3=new Car("toyota","corolla",2010,"gri");
        System.out.println(car3);/*
        Car{marka='toyota'
            , model='corolla'
            , yıl=2010
            , km=0
            , renk='gri'}*/








    }









}
