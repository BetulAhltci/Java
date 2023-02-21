package day10_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        String str2="   ";
        String str3;
        String str4=null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//3

        System.out.println(str1.isEmpty());//str1 boşmu? true
        System.out.println(str2.isEmpty());//false

        System.out.println(str1.isBlank());//sadece space denmi ouşuyor true
        System.out.println(str2.isBlank());//true


        //null bir değer değil işaretçidir (null pointer)
        //null pointer: non primitive bir objenin oluşturulduğunu
        //              anck bilinçlı olarak değer atanmadığını işaretler
        //              str4'un değeri null'dır cümlesi yanlıstır
        //              str4 null olarak işretlenmiştir doğru cümle

       // System.out.println(str3.length());// değer ataması yok
        // System.out.println(str3.concat("ali can"));
       // System.out.println(str3.substring(3,4));

        /* Java bir variable ı olutrup bir değer atanmamasına izin verir
        bir variable ı değer atamadan OLUŞTURABİLİRSİNİZ ancak KULLANAMAZSINIZ
        değer atamadan bir variable ı kullanmaya kalkarsanız java CTE verir

        null pointer ise bu variable bir atama yapılmadığını ve bunun bilinçli bir tercih olduğunu
        javaya söyler. Java kodların çalışmasına izin verir.Ancak değer atanmadığından
        metodların kullanımına izin vermez
        */

        str4=null;
        //System.out.println(str4.length());//NullPointerException
        //System.out.println(str4.substring(3,4));// java bu kullanıma izin verir ancak çalıştırdığımızda hata verir

        System.out.println(str4);//null
        System.out.println(str4+"ali can");//nullali can
        System.out.println(str4.concat("ali can"));//NullPointerException
    }
}
