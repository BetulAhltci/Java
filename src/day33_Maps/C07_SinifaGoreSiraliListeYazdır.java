package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdır {
    public static void main(String[] args) {
        //Tüm ögrenci listesini
        //sinif sube isim soyisim no sekinde
        //dogal olarak sıralı
        //yadıran bir method yazın

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.sinifListesiSiraliYazdır(ogrenciMap);
    }
}
