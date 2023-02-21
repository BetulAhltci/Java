package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdırma {
    public static void main(String[] args) {
        //verilen bölümdeki ögrencilerin
        //No,isim,soyisim,Sınıflarını yazdıran method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.bolumListesiOlustur(ogrenciMap,"MF");
    }
}
