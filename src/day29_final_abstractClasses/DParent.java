package day29_final_abstractClasses;

public abstract class DParent {

    /*child classları tamamında method1 ve method2 yi mutlaka icermeli

    Java parent class daki istenen methodları child class ların override etmek ZORUNDA KALMASI icin
    abstract classını olusturmustur

    Bir class ı abstrat yapmak için class declarasyonuna abstract yazmak yeterlıdir

    Bir abstract class ın içinde child class ların override etmesi MECBURİ olan metodlar olabileceği gibi
    MECBURİ OLMAYAN metodlarda olabilir

    Child class ların mutlaka override edeceği metodları da abstract yaparız

    Asrteact yapılan tüm methodlar child class ların tamamında override edileceğinden parent class daki abstract
    methodun bodyye ihtiyacı olmaz
    Javada abstract methodların body si olmasına izin vermez

    Abstract class'larda abstract metodlar bulunduğu için bu class'lardan obje ÜRETİLEMEZ


    */

    public abstract void method1();

    public abstract void method2();

    public void method3(){
        System.out.println("Parend class'daki method calıştı");
    }
}
