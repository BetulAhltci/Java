package day32_Set_Map;

import java.util.Map;

public class C08_subeListesiOlusturma {
    // verilen sınıf ve sube ismi ile sınıf listesini yazdıran method olusturun

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesiYazdirma(ogrenciMap,"10","k");
    }
}
