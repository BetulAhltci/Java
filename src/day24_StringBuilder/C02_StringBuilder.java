package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");

        System.out.println(sb.capacity());//20
        System.out.println(sb.length());//4

        sb.trimToSize();
        //atama yapmdığımız halde bu değişiklik kalıcı olurmu?
        //StringBuilder mutableolduğundan metodlarla yapılan değişiklikler kalıcı olur
        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();
        System.out.println(sb);
        //StringBuilder'i String e cevirirseniz veya String döndürecek metodlar kullanırsanız
        //String ın immutable özelliği devreye girer ve tyapılan değişiklikler kalıcı olmaz

        //sb=sb.toString().toUpperCase();
        //nonprimitive data türlerinde farklı data türünden atama yapılmaz


        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2);//JAVA

        sb=sb2;
        System.out.println(sb2);//JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb);//HAVA

        System.out.println(sb.substring(2, 3));//V
        System.out.println(sb);//HAVA

        System.out.println(sb.reverse());//AVAH
        System.out.println(sb);//AVAH


        String uzunmetin="ETMEK YOK ÇALIŞMAK VAR";
        System.out.println(sb.insert(1, "H "));//AH VAH
        sb.insert(6,uzunmetin,0,10);
        System.out.println(sb);//AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3));//4
        System.out.println(sb.indexOf("VAH"));//3

        System.out.println(sb.lastIndexOf("VAH"));//3
        sb.lastIndexOf("E",9);//7

        sb.replace(0,12,"SORUN ");
        System.out.println(sb);//SORUN YOK

        sb.delete(5,sb.length());//Başlangıç indeksi dahil, bitiş indeksi dahil değil
        System.out.println(sb);//SORUN


    }
}
