package day11_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        //eğer şart i nin hiçbir değeri için true olmuyorsa
        // input olarak verilen sayıdan bire kadar tüm sayıları yazdırın

        int input = -23;
        if (input>1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }else{
            for (int i = input; i <1 ; i++) {
                System.out.print(i+" ");

            }
        }


    }
}

