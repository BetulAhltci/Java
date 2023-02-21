package day26_Inheritance;


import java.util.concurrent.Callable;

class Okul{

    String okulismi="Yıldız Koleji";
    String telefon="3123456543";
}

public class C01_Sinif extends Okul {

    String sinif = "11/F";
    String telefon = "562234434";

    C01_Sinif(String telefon) {
        System.out.println(telefon);//scope dakini yazar 45689312879
        System.out.println(this.telefon);//class daki 562234434
        System.out.println(super.telefon);//parend daki 3123456543

        System.out.println(okulismi);//Yıldız Koleji
        System.out.println(this.okulismi);//Yıldız Koleji
        System.out.println(super.okulismi);//Yıldız Koleji

        System.out.println(sinif);//11/F
        System.out.println(this.sinif);//11/F
        // System.out.println(super.sinif);
        //Javada parend de olmayanı child den alma yoktur
        //parend class da aranan sınıf değeri olmadığından CTE verir

    }

    public static void main(String[] args) {
        C01_Sinif obj = new C01_Sinif("45689312879");


    }
}


