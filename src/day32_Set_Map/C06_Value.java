package day32_Set_Map;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {
        //mapOlustur methodu bize bir map döndürüyor
        //biz o class daki map'i kulanmak istiyoruz ama
        //her seferinde o class a gidip o map i yeniden olusturmamız isimize yaramaz

        //Bu class da bir map oluşturmak istediğimde
        //new HashMap<>() yazıyoruz
        //ancak bu bize bos bir map getiriyor
        //bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur methodunu calıstırırsak bize dolu bir map getirir
        //bizde onu içinde olduğmuzz class'da olusturduğumuz ogrenciMap'e atama yaparız

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-Mf");
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-cem-10-K-TM, 103=Ali-Cem-10-H-MF, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-MF,
        // 106=Seggi-Can-10-K-MF, 110=Cemal-Han-12-M-Mf}

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 110]
        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-cem-10-K-TM, Ali-Cem-10-H-MF, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-MF,
        // Sevgi-Can-10-K-MF, Cemal-Han-12-M-Mf]

        //verilen ismin ogrenciMap'de olup olmadığını kontrol edip
        //true yada false dönen bir method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc);//true
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Kemal"));//false



    }
}
