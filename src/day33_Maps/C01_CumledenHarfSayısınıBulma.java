package day33_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_CumledenHarfSayısınıBulma {
    public static void main(String[] args) {
        //verilen bir cumlede kullanılan her bir harfi ve kacar kez kullanıldığını yaxdırın
        //örnek: Java Candır
        //output: J=1 a=3 v=1 C=1 n=1 i=1 r=1

        String cumle= "Java candır";

        //öncelikle bosluk ve noktalama işaretlerini yok edelim
        cumle=cumle.replaceAll("\\W","");//Javacandır

        String[] cumlearr=cumle.split("");//[J, v, a, c, a, n, d, ı, r]

        Map<String,Integer> kullanimSayilariMap= new HashMap<>();

        for (int i = 0; i < cumlearr.length; i++) {
            //her bir elementi ele alıp
            //map'de key yoksa value=1 olarak ekleriz
            //map'de key olarak varsa value 1 arttırılmalı

            if (!kullanimSayilariMap.containsKey(cumlearr[i])){
                kullanimSayilariMap.put(cumlearr[i],1);
            }else {

                int eskiValue= kullanimSayilariMap.get(cumlearr[i]);
                kullanimSayilariMap.put(cumlearr[i],eskiValue+1);
            }
        }
        System.out.println(kullanimSayilariMap);


    }
}