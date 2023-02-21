package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
        /*
        asagıdaki body'i map olarak olusturun

          {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2021-06-01",
                   "checkout" : "2021-06-10"
                              },
            "additionalneeds" : "wi-fi" }
         */

        Map<String,String> bookingdatesMap= new HashMap();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        Map<String,Object> bookingMap= new HashMap<>();
        bookingMap.put("firstname","Ahmet");
        bookingMap.put("Lastname","Bulut");
        bookingMap.put("Totalprice",500);
        bookingMap.put("depositpaid","false");
        bookingMap.put("bookingdates",bookingdatesMap);
        bookingMap.put("additionalneeds","wi-fi");

        System.out.println(bookingMap);
        /*
        {Totalprice=500,
         firstname=Ahmet,
          additionalneeds=wi-fi,
           bookingdates={
                checkin=2021-06-01,
                 checkout=2021-06-10},
         Lastname=Bulut,
          depositpaid=false}
         */

        //isim bilgisi yazdırın
        System.out.println(bookingMap.get("firstname"));//Ahmet

        //aditionalneeds yazdırın
        System.out.println(bookingMap.get("additionalneeds"));//wi-fi

        //chek-in bilgisi yadırın
        //booking map'daki value data turunu Object sectik
        //dolayısıyla bookingdates key'ine ait value'yu Object olarak bize getirir
        //ama biz onun map olduğunu biliyoruz o halde casting yapabiliriz



    }
}
