package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C06_SınıflarıArttırma {
    public static void main(String[] args) {
        //ogrenci map'daki tum sınıf değerlerini 1 arttırın
        //12. sınıfta olan varsa sınıf bilgisini mezun yapın

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.siniflariArttir(ogrenciMap);

        MapMethodDepo.tumListeYazdır(ogrenciMap);



    }
}
