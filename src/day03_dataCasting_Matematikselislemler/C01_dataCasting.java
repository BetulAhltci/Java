package day03_dataCasting_Matematikselislemler;

public class C01_dataCasting {
    public static void main(String[] args) {

        /*eğer geniş kapaiteli data türünden dar kapasiteli data türüne casting yapmak isterseniz
         java bunu gerçekleştirmez sizden müdahale ister.
        işlemin gerçekleşmesi için cast etmek istediğiniz değerin önünde dönüştürmek istediğiniz dsts türü yazmalı.
        Bu işleme EXPLİCİT NARROVİNG denir. data kayıpları olabilir.
         */

        short sayi1=45;
        int sayi2= sayi1;
        //değerin kapasitesi variable nin kapasitesinden küçük

        int sayi3=55;
        double sayi5=sayi3;
        //değerin kapasitesi variable ın kapasitesinden küçük

        double sayi6=6;
        int sayi7=(int) sayi6;

        // double olan değerin kapaitesi int olan variable ın kapasitesinden buyük. java kabul etmez




        }
    }

