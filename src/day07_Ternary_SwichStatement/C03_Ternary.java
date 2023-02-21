package day07_Ternary_SwichStatement;

public class C03_Ternary {
    public static void main(String[] args) {
        //input olarak verilen sayıyı kontrol edip
        //sayı çift ise "cift sayı"
        //değise "tek sayı" yazdırın

        int input=33;
        if (input%2==0){
            System.out.println("Çift sayı");
        }else{
            System.out.println("tek sayı");
        }

        // ternary ile yaoalım

        System.out.println(input%2==0 ? "çift sayı":"tek sayı");
    }
}
