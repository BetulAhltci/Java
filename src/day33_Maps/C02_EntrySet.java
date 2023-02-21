package day33_Maps;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        //tüm öğrencileri 101=Ali-Can-11-MF şeklinde yazdır

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-10-H-MF, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-MF, 106=Sevgi-Can-10-K-MF}

        System.out.println("No   Öğrenci Bilgileri");
        System.out.println("=======================");

        //once ogrenci numaralarını elde edelim
        Set<Integer> ogrencinoSet=ogrenciMap.keySet();

        for (Integer eachKey:ogrencinoSet
             ) {
            System.out.println(eachKey+"="+ogrenciMap.get(eachKey));
        }

        /*
        aslınnda bizden istenen map'in içindeki elementler
        Java Map'deki elementleri key-Value ikilisi olarak alabilmeiz icin ENTRY Intercace'ini olusturmustur

        entr'lerde map ile aynı data yapısına sahipolmalıdır
        örneğin ögrencci map'ini düsünursek entry'ler

        Entry<Integer,String

         */

      Set<Map.Entry<Integer,String>>ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No  OgrenciBilgileri");
        System.out.println("==========================");

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }


    }
}
