package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdırma {
    public static void main(String[] args) {
        //verilen sınıftakı öğrencilerin no,isim,soyisim,bölümlerini
        //bir liste olarak yazdıran methodu yazdırın

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");


    }
}
