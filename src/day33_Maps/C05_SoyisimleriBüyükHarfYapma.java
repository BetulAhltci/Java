package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBüyükHarfYapma {
    public static void main(String[] args) {
        //Mapdeki soyisimleri büyükharfe ceviren bi method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=MapMethodDepo.soyIsimleriBuyukHarfYap(ogrenciMap);

    }
}
