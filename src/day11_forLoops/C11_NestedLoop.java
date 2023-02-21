package day11_forLoops;

public class C11_NestedLoop {
    public static void main(String[] args) {

        /*
        input değerine kadar her satırda * sayısını bir rttırıp
        sonra azzaltarak aşağıdaki şekli yazdırın
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

       ipucu: artış ve azalış kısımlarını iki ayrı nested loop ile yapabilirsiniz
         */

        int input=4;

        //artış kısmı için nested loop

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //azalış kısmı için nested loop

        for (int i = input-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}
