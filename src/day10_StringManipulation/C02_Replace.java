package day10_StringManipulation;

public class C02_Replace {
    public static void main(String[] args) {


         String str="Java öğren adana ye";
        System.out.println(str.replace('a','A'));//JAvA öğren AdAnA ye

        System.out.println(str.replace(" ",""));//Javaöğrenadanaye

        System.out.println(str.replace("Java","Yazılım"));//Yazılım öğren adana ye

        String telefon="555 3451234";
        System.out.println(telefon.replace("555","532"));//532 3451234
        System.out.println(telefon.replace('3','7'));//555 7451274

        //aşağıdaki arama sonucunun 10 binden fazla olduğunu test edin
        String sonuc="1-16 of over 100,000 results for \"apple\"";
        int indexOver=sonuc.indexOf("over");
        int indexResult=sonuc.indexOf("result");
        String sonucSayısıStr=sonuc.substring(indexOver+5,indexResult-1);
        System.out.println(sonucSayısıStr);//100,000

        sonucSayısıStr=sonucSayısıStr.replace(",","");
        System.out.println(sonucSayısıStr);//100000


        }


    }

