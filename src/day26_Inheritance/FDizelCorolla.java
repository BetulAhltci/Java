package day26_Inheritance;

import day19_ArrayList_ForEachLoop.Toyota;

import java.util.ArrayList;
import java.util.List;

public class FDizelCorolla extends ECorolla {

    String motor="1.6 dizel motor";
    String yakıt="Dizel";
    String guvenlik="ABS";
    String renk="Renk belirtilmedi";

    public static void main(String[] args) {

       DToyota c3=new FDizelCorolla();

        System.out.println(c3.motor);//DT Motor Belirtilmedi
        System.out.println(c3.yakıt);//DT Yakıt belirtilmedi

        //System.out.println(c3.guvenlik);//CTE
       // System.out.println(c3.renk);//CTE

        System.out.println(c3.model);//DT Model belirtilmedi

       // System.out.println(c3.uretimyeri);//CTE
       // System.out.println(c3.teker);//CTE
       // System.out.println(c3.vites);//CTE
        System.out.println(c3.marka);//DT Toyota


        //Bazen child class dan obje oluşturmakla beraber
        //bu child class ın pared class ındaki hangi özellikleri
        //aldığını bilmek isteriz
        //Bu durumda data türünü constructor u kullanılan class ın
        // patent class larından secebiliriz

        ECorolla c2= new FDizelCorolla();

        System.out.println(c2.motor);//T Motor belirtilmedi
        System.out.println(c2.yakıt);//T Yakıt belirtilmedi
       // System.out.println(c2.guvenlik);//CTE
       // System.out.println(c2.renk);//CTE

        System.out.println(c2.model);//Corolla Corolla
        System.out.println(c2.uretimyeri);//C Türkiye
        System.out.println(c2.teker);//C 205*55
        System.out.println(c2.vites);//C Vites belirtilmedi
        System.out.println(c2.marka);//T Toyota


        FDizelCorolla c1= new FDizelCorolla();

        System.out.println(c1.motor);//DC 1.6 dizel motor
        System.out.println(c1.yakıt);//DC Dizel
        System.out.println(c1.guvenlik);//DC ABS
        System.out.println(c1.renk);//DC Renk belirtilmedi

        System.out.println(c1.model);//Corolla Corolla
        System.out.println(c1.uretimyeri);//C Türkiye
        System.out.println(c1.teker);//C 205*55
        System.out.println(c1.vites);//C Vites belirtilmedi

        System.out.println(c1.marka);//T Toyota











    }






}
