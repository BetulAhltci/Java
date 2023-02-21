package day32_Set_Map;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {

        //numarası verilen ogrencinin sube ismini verilen sube yapan method yazınınız

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");
        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,101,"L");
        System.out.println(ogrenciMap);
    }
}
