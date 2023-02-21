package day35_GenelTekrar;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //Verilen bir LinkedList'de istenen iki elementlerin yerini değiştirin

        LinkedList<String> isimler=new LinkedList<>();

        isimler.add("Said");
        isimler.add("Hüseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Hümeyra");

        System.out.println(isimler);//[Said, Hüseyin, Hasan, Sevilay, Hümeyra]

        //Hasan ile Hümeyra'nın yerini değiştiriniz
        //büyük bir listede imdex bilmeden yapalım

        String ilkisim="Said";
        String ikinciIsim="Hümeyra";

        String temp="";

        temp=ilkisim;
        int ilkIsimIndex=isimler.indexOf(ilkisim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);

        System.out.println(isimler);//[Hümeyra, Hüseyin, Hasan, Sevilay, Said]
















    }
}
