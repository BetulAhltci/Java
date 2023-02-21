package day16_Arrays;

public class C06_arraysSoru {
    public static void main(String[] args) {
        //bir marketin fiyaflarını tutan bir array var
        //bu marketteki en yüksek ve en düşük fiyatları yazdıran bir method yazdırın

        double[]fiyatlar={23,34.5,42.1,5.7,3.7,3.4,23.5};
        EnyuksekEndüşükFiyatYadır(fiyatlar);//listedeki en düşük fiyat: 3.4
                                            // Listedeki en yuksek fiyat: 42.1


    }
    public  static void EnyuksekEndüşükFiyatYadır(double[]fiyatlar){

        double endusukFiyat=fiyatlar[0];
        double enyuksekFiyat=fiyatlar[0];

        for (int i = 0; i <fiyatlar.length ; i++) {

            if (fiyatlar[i]<endusukFiyat){
                endusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enyuksekFiyat){
                enyuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("listedeki en düşük fiyat: "+ endusukFiyat);
        System.out.println("Listedeki en yuksek fiyat: "+ enyuksekFiyat);

    }

}
