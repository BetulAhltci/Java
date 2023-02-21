package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_soru {
    public static void main(String[] args) {
        //Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        List<String> isimListesi=isimListesiOlustur();
        System.out.println(isimListesi);


    }





    public static List<String> isimListesiOlustur(){

        List<String> isimListesi= new ArrayList<>();
        String girilenisim="";
        Scanner scan= new Scanner(System.in);

        while (!girilenisim.equalsIgnoreCase("q"));{

            System.out.println("Listeye eklemek için bir isim girin\nBitirmek için q ya bas");
            girilenisim=scan.nextLine();

            if(!girilenisim.equalsIgnoreCase("q")){
                isimListesi.add(girilenisim);
            }
        }
        return isimListesi;
    }

}
