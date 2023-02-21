package day08_StringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str = "Java güzeldir";//13 karakter var

        // javada indeks 0 dan başlar
        // J==>0.index, r==>12.index
        //charAt(idex) ile istedğimiz index deki char a ulaşabiliriz

        //ilk a yı yadıralım
        System.out.println(str.charAt(1));

        //sondan ikinci harfi yazdır
        System.out.println(str.charAt(13 - 2));//karakter sayısı-2 index deki eleman (i)

        //sondan 4. karakteri büyük harf yazdır
        System.out.println(str.toUpperCase().charAt(13 - 4));//L

        //charAt() metodu bize char döndürdüğü için toUpperCase çalışmaz
        //String metodlarını charAt ile kullanmk isterseniz
        //charAt() den önce kullanmalısınız

        //System.out.println(str.charAt(13));//StringIndexOutOfBoundsException
        //index dışında bir değer verirsek o index i bulamaycağı için hata verir
    }
}
