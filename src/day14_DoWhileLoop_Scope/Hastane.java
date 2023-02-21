package day14_DoWhileLoop_Scope;

public class Hastane {

    static String hastaneIsmi="Yıldız Hastanesi";
    static String hataneAdresi="Çankaya/Ankara";

    String personelismi;
    String personelAdresi;
    String personelTel;



    public static void main(String[] args) {
        Hastane p1= new Hastane();//ünt taraftaki personelle ilgili variable ları oluşturur ve nulldeğerini atar
        p1.personelismi="Kemal";// değer atandığında null değerini değiştirir

        Hastane p2=new Hastane();
        p2.personelTel="123654555";


    }
}
