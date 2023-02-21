package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSıraliListe {
    public static void main(String[] args) {
        //tüm öğrenci listesini isim soyisim no sınıf sube bölüm
        //seklinde sıralı olarak yazdıran biemethod yazınız

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSouisimSiraliListeYazdir(ogrenciMap);

    }
}
