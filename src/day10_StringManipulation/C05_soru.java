package day10_StringManipulation;

public class C05_soru {
    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        //  - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //  - cumlede is geciyorsa, “calismak guzeldir”
        //  - ikisini de iceriyorsa “Hem ev lazim hem is”
        //  - hicbirini icermiyorsa “cok calisman lazim” yazdirin

        String str="Evden yatıyorum, sirkete gitmeye gerek yok";
        String calısılacakstr=str.toLowerCase();

        if(calısılacakstr.contains("ev")&&calısılacakstr.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        }else if (calısılacakstr.contains("iş")) {
            System.out.println("calismak guzeldir");
        }else if (calısılacakstr.contains("ev")){
            System.out.println("home home sweet home");
        }else {
            System.out.println("cok calışmam gerek cok");
        }
    }
}
