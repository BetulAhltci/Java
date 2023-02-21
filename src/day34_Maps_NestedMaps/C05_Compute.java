package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfSayilariMap=new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);//{A=10, C=15, D=3, K=5}

        //A'nın kullanım miktarını20 yapın
        harfSayilariMap.put("A",20);

        //C'nın kullanım miktarını ikikatına cıkar
        harfSayilariMap.put("C",harfSayilariMap.get("C")*2);

        //D'nin miktarını 5 arttıralım
        harfSayilariMap.compute("D",(k,v) -> v+5);
        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=5}

        //eğer Map'de "T" varsa kullanım miktarını 3 esiltin
        harfSayilariMap.computeIfPresent("T",(k,v) ->v-3);
        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=5}

        //K harfi varsa kullanımını 2 azaltın
        harfSayilariMap.computeIfPresent("K",(a,b) -> b-2);
        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanım miktarı 3 olarak ekleyin
        harfSayilariMap.computeIfAbsent("T", v->3);
        System.out.println(harfSayilariMap);//{A=20, C=30, D=8, K=3, T=3}





    }

}
