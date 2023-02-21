package day13_methodoverLoading_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //2 basamaklı sayılardan 7 ile bölünebilenleri yazdırın

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");

        //aynı soruyu While Loop ile yaoalım
        int sayı=10;
        while (sayı<100){
            if (sayı%7==0){
                System.out.print(sayı+" ");
            }
            sayı++;
        }
        //for loop ile yapılabilecek soruyu while loop ile yapmak hem zahmetli hem riskli
    }
}
