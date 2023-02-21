package day15_Scope_Arrays;

public class C02_Hastane {

    static String hastaneIsmi="Yıldız Hastanesi";
    static String hataneAdresi="Çankaya/Ankara";

    String personelismi="personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";


    public static void main(String[] args){

        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2= new C02_Hastane();
        per1.personelismi= "Harun";
        per2.personelAdresi="Cankaya";
        per1.hastaneIsmi="Java Hastanesi";
        System.out.println(per1.personelTel); // Telefon
        System.out.println(per1.personelismi); // Harun
        System.out.println(per2.personelismi); // Personel
        System.out.println(per2.personelAdresi); // Cankaya
        System.out.println(per1.hastaneIsmi); // Java
        System.out.println(per2.hastaneIsmi); // Java
        System.out.println(hastaneIsmi); // Java
        per1.personelismi= "Mehmet";
        System.out.println(per1.personelismi); // Mehmet
        System.out.println(per2.personelismi); // personel
    }
}



