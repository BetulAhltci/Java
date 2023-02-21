package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        //verilen inputa göre çarpım tablosu oluşturun
        //javada iç içe yapılara nested denir
        //burada farklıolan sadece i'nin katsayısı olduğundan onun içinde bir loop olusturulur

        int input=4;

        /* 1  2   3   4
           2  4   6   8
           3  6   9  12
           4  8  15  16
         */

        //1  2   3   4
        for (int i =1 ; i <=4 ; i++) {
            System.out.print(1*i+" ");
        }
        System.out.println();

        //2  4   6   8
        for (int i =1 ; i <=4 ; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        //3  6   9  12
        for (int i =1 ; i <=4 ; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println();
        //4  8  15  16
        for (int i =1 ; i <=4 ; i++) {
            System.out.print(4 * i + " ");
        }
        System.out.println();


        //  NESTED ÇÖZÜMU

        for (int i = 1; i <=4 ; i++) {//outer loop denir ve inin çarpılacağı sayıyı kntrol eder(sutun)
            for (int j = 1; j <=4 ; j++) {//iner loop denir ve i değikenini kontrol eder(satır)
                System.out.print(i*j+" ");


            }
            System.out.println();
        }
            //outher loop un her değer artışı için outher loop tekrar çalışır
    }
}
