package day10_StringManipulation;

public class C08_ForLoop {
    public static void main(String[] args) {
         // 1 ile 1000 arasındaki sayıları(sınırlar dahil) yanyana yazdırın
        // yazdırma işlemi bittiğinde
        //"tüm sayılrın toplamı= sayılar toplamı" yazdırın

        int sayılarıntoplamı=0;

        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i + " ");
           // sayılarıntoplamı=sayılarıntoplamı+1;
            sayılarıntoplamı+=i;
        }

        System.out.println("");
        System.out.println("tüm sayıların toplamı="+sayılarıntoplamı);
    }
}
