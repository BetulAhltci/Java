package day32_Set_Map;

import java.util.*;

public class MapMethodDepo {

    public static Map<Integer, String> ogrenciMapOlustur() {
        //bie ögrenciMap döndüren bir method yazınız

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");


        return ogrenciMap;

    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        //1-tüm value'leri bir collection olarak kaydedelim
        //  [Ali-Can-11-H-MF, Veli-cem-10-K-TM, Ali-Cem-10-H-MF, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-MF, Sevgi-Can-10-K-MF, Cemal-Han-12-M-Mf]
        Collection<String> valuesCollection = ogrenciMap.values();

        //2-foreach kullanarak her value'yu ele alalım--- Ali-Can-11-H-MF
        //3- -'yi kullanarak split yapalım--- [Ali, Can, 11, H, MF]
        //4-Split yaptıgımız array'den isim bilgisini alalım---0. index
        //5-Eğer value'den aldığımız isim aranan isim ile aynı ise true döndürüp foreach' bitirelim
        //6-foreach bittiginde true olmadıysa false döndurelimscv

        for (String eachValue : valuesCollection
        ) {
            String[] valuearr = eachValue.split("-");
            String valuedekiIsim = valuearr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;

    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        //1-Map'deki value'leri colection olarak kaydedin
        Collection<String> ogrencValueColection = ogrenciMap.values();
        System.out.println("Isim Soyisim Sınıf Sube");

        //2-for-each ile her bir value bilgisinni ele alalım
        //3-value'yu - ile split yapıp bir array elde edelim
        //4-array'in birinci index'indeki soyisme bakıp aranan isim ile aynı ise bilgileri yazdıralım

        for (String eachValue : ogrencValueColection
        ) {
            String[] valuearr = eachValue.split("-");
            String valueSoyisim = valuearr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valuearr[0] + " " +
                        valuearr[1] + " " +
                        valuearr[2] + " " +
                        valuearr[3]);
            }

        }
    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Isim  Soyisim");
        for (String eachValue : valueCollection
        ) {
            String[] valuearr = eachValue.split("-");

            if (valuearr[2].equalsIgnoreCase(sinif) && valuearr[3].equalsIgnoreCase(sube)) {
                System.out.println(valuearr[0] + " " + valuearr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yenisubeismi) {

        //1-Okul numarasını biliyoruz direk ogrenci value ulasabiliriz
        String ogrenciValue = ogrenciMap.get(okulNo);

        String[] valuearr = ogrenciValue.split("-");

        //2-sube ismini güncelleyelim

        valuearr[3] = yenisubeismi;

        //3-array'deki güncel bilgileri yeniden value formatında bir string yapalım

        String yeniValue = valuearr[0] + "-" + valuearr[1] + "-" + valuearr[2] + "-" + valuearr[3] + "-" + valuearr[4];

        //4- öğrenci no yani key ile yeni value'yu map e ekleyelim

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) { // 101=Ali-Can-11-H-MF

            // 1- entry'den value'yu alalim
            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF

            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr = entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
            }

        }

    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //1-EntrySet olusturalım
        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();

        //2-for-each Loop ile her bir entry'i elden gecirip soy isimleri büyük harf yapalım
        for (Map.Entry<Integer, String> eachEntry : entrySet) {

            //3-Entry'den value alalım
            String entryvalue = eachEntry.getValue();//Ali-Can-11-H-MF

            //4-soy isim bilgisine ulasıp değiştirebilmek için parcala
            String[] entryValueArr = entryvalue.split("-");//[Ali, Can, 11, H, MF]

            //5-soyismi buyukharf yapalım
            entryValueArr[1] = entryValueArr[1].toUpperCase();

            //6-değişikliği yaptıktan sonra yeniden birlestiemeleri yapıp mapi update edelim
            //7-setValue() kullanarak value'yu yeni haline update edelim
            eachEntry.setValue(entryValueArr[0] + " " +
                                entryValueArr[1] + " " +
                                entryValueArr[2] + " " +
                                entryValueArr[3] + " " +
                                entryValueArr[4]);
        }
        return ogrenciMap;

    }

    public static void tumListeYazdır(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println("No  OgrenciBilgileri");
        System.out.println("==========================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static void bolumListesiOlustur(Map<Integer, String> ogrenciMap, String bolum) {
        //verilen bölümdeki ögrencilerin
        //No,isim,soyisim,Sınıflarını yazdıran method olusturun

        System.out.println("No  Isim  Soyisim Sınıf");

        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : entrySet
        ) {
            String entryvalue = eachEntry.getValue();
            String[] valuearr = entryvalue.split("-");
            if (valuearr[4].equals(bolum)) {
                System.out.println(eachEntry.getKey() + " " +
                                    valuearr[0] + " " +
                                    valuearr[1] + " " +
                                    valuearr[2]);
            }
        }
    }

    public static Map<Integer, String> siniflariArttir(Map<Integer, String> ogrenciMap) {
        //map'de istediğimiz değişikliği yaptıktan sonra
        //map'i update etmenin en kolay yolu setEntry()

        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySet) {

            String entryvalue = eachEntry.getValue();

            String[] entryValueArr = entryvalue.split("-");

            int sinifint = Integer.parseInt(entryValueArr[2]);

            if (sinifint == 12) {
                entryValueArr[2] = "Mezun";
            } else {
                entryValueArr[2] = sinifint + 1 + "";
            }
            //sınıf bilgisini güncelledik
            //bu güncellemeyi map eişlemeleyiz

            eachEntry.setValue((entryValueArr[0] + "-" +
                                entryValueArr[1] + "-" +
                                entryValueArr[2] + "-" +
                                entryValueArr[3] + "-" +
                                entryValueArr[4]));

        }
        return ogrenciMap;

    }

    public static void sinifListesiSiraliYazdır(Map<Integer, String> ogrenciMap) {
        //101=Ali-Can-11-H-MF
        //11 H Ali Can 101

        //Tüm ögrenci listesini
        //sinif sube isim soyisim no sekinde
        //dogal olarak sıralı
        //yadıran bir method yazın

        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti=new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntry : entrySet) {

            String entryValue = eachEntry.getValue();//Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-");//[Ali, Can, 11, H, MF]

            //Entry den istenen bilgileri alıp yeni bir String oluşturalim
            //bu Stringleri sıralı olarak yazdıralım

            String istenenFormattakiBilgi = entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    eachEntry.getKey();
            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }
        System.out.println("sınıf sube isim no");
        System.out.println("====================");

        for (String each:siraliOgrenciSeti
             ) {
            System.out.println(each);
        }
    }

    public static void isimSouisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        //tüm öğrenci listesini isim soyisim no sınıf sube bölüm
        //seklinde sıralı olarak yazdıran biemethod yazınız

        Set<Map.Entry<Integer, String>> entrySet = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet=new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySet) {
            String value=eachEntry.getValue();
            String[] valuearr=value.split("-");
            String istenenFormattakiBilgi=valuearr[0]+" "+
                                            valuearr[1]+" "+
                                            eachEntry.getKey()+" "+
                                            valuearr[2]+" "+
                                            valuearr[3]+" "+
                                            valuearr[4];
            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);
        }

        System.out.println("isim soyisim no sınıf sube bolum");
        System.out.println("=================================");

        for (String each:isimSoyisimSiraliSet
             ) {
            System.out.println(each);
        }


    }
}

