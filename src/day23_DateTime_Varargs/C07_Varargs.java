package day23_DateTime_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        //Kactane string argüment yazılırsa yazılsın
        //Argümentlerin en uzun olanını yazdıran bir metod oluşturun
        //Not: En uzun kelime birden fazla iseilkini  yazsın

        enUzunKelimeYazdır("Ilyas","Berivan","Murat");//Berivan
        enUzunKelimeYazdır("Mehmet","Vahit","Java","Zafer");//Mehmet
    }

    private static void enUzunKelimeYazdır(String...kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachkeline:kelimeler
             ) {
            if (eachkeline.length()>enUzunKelime.length()){
                enUzunKelime=eachkeline;
            }
        }
        System.out.println(enUzunKelime);
    }
}
