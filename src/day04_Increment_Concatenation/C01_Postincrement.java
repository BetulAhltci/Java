package day04_Increment_Concatenation;

public class C01_Postincrement {
    public static void main(String[] args) {

        int sayi=10;
                //sayıyı 3 arttır

        sayi=sayi+3;//13
        sayi+=3;//16
        sayi++;//17
        sayi++;//18
        sayi++;//19
        System.out.println(sayi);//19

        //sayıyı iki azaltın
          sayi=sayi-2;//17
          sayi--;//16
          sayi--;//15
        System.out.println(sayi);//15


        sayi=10;
                //sayının değerini 1 azaltın sonra yazdırın
        sayi--;
        System.out.println(sayi);//9
        // bu işlemde ekranda gördüğümüz 9 sayının değeri 9

        sayi=10;
        // sayıyı önce yazdır sonra bir azalt
        System.out.println(sayi);
        sayi--;
        //ekrannda görünen 10 degeri 9
        System.out.println(sayi);//10

        sayi=10;
        sayi++;//say bir artar
        ++sayi;//sayı bir artar
        System.out.println(sayi);//12


        sayi=10;
        System.out.println(sayi++);//10
        //java aynı anda iki işlem olduğunda sıralama yapar
        //++ variableden sonra ise önce yazdırır sonra arttırır
        System.out.println(sayi);//11

        sayi=10;
        System.out.println(++sayi);//11
        //++ variableden önce ise arttırma işlemini önce yapar sonra yazdırır
        System.out.println(sayi);// sayının degeri 11 ekranda görünen 11




    }
}
