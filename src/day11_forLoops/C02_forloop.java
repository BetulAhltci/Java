package day11_forLoops;

public class C02_forloop {
    public static void main(String[] args) {
        //input olarak verilen bie String de
        // index i tek sayı olanları küçük harfle
        //index i çift sayı olanları büyük hsrfe yazdırın
        //örnek: Java output: JaVa

        String input= "Java candır, Selenyum heyecandır.";

        for (int i = 0; i <input.length() ; i++) {
            System.out.print( i%2==0 //index çift mi
                    ? input.substring(i,i+1).toUpperCase()//index cift ise
                    : input.substring(i,i+1).toLowerCase()//index çift değise
                    );
        }
    }
}
