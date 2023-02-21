package day24_StringBuilder;

public class EncapsuleClass {

        /*
        Java class üyelerie erişimin write and read olarak ayrılması istendiğinde  Encapsulation kullanır

        Bunun için öncelikle bu class uyelerine normal yollarla erişim kapatılır
         */



    private int satiş;// satış bölümunden değer girilebilsin ama değeri görünemesin
    private int rapor=100;//görülebilsin ama değiştirilemesin
    private int halkaAçık=10;//herkese acık olsun


    public void setSatiş(int satiş) {
        this.satiş = satiş;
    }
}

