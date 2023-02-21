package day32_Set_Map;

import java.util.Map;

public class C07_SoyisimIleOgrenciarama {
    //ögrenci map^'de aradığımız soyisimdeki öğrencilerin
    //ısim,Soyisim,sınıf ve sube bilgilerini tablo olarak döndüren method yazınız

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Cem");

    }



}
