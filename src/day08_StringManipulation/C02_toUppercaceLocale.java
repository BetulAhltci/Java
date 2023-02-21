package day08_StringManipulation;

import java.util.Locale;

public class C02_toUppercaceLocale {
    public static void main(String[] args) {

        String str ="JAVA CANDIR";
        System.out.println(str.toLowerCase());//java candir

        str= str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);//java candır

        str= "sevgi insanı hayata bağlar";
        System.out.println(str.toUpperCase());// SEVGİ İNSANI HAYATA BAĞLAR

        str=str.toLowerCase(Locale.ENGLISH);
    }
}
