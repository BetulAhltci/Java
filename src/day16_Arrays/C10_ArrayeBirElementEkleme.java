package day16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C10_ArrayeBirElementEkleme {
    public static void main(String[] args) {

        //Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.

        String[] isimler={"Ali","Veli","Cem"};
        String eklenecekisim="kemal";

        isimler=ArrayeElementEkleme(isimler,eklenecekisim);

        System.out.println(Arrays.toString(isimler));//[Ali, Veli, Cem, kemal]
    }
    public static String[] ArrayeElementEkleme(String[]eklenecekarray,String eklenecekElement){
        String[] temp=new String[eklenecekarray.length+1];

        for (int i = 0; i <eklenecekarray.length ; i++) {
            temp[i]=eklenecekarray[i];
        }
        temp[temp.length-1]=eklenecekElement;
        return temp;
    }
}
