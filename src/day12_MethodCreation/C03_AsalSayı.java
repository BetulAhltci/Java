package day12_MethodCreation;

public class C03_AsalSayı {
    public static void main(String[] args) {
        // verilen bir sayının asal olup olmadığını true/false olarak dondüren bir metod oluşturun

        //asalSayıMı metodu boolean bir sonuç döndürdüğünden
        //bu metodu çalıştırdığımızda
        // ya direk yazdırmalıyız

        System.out.println(asalSayiMi(34));//false

        //veya metod coll un getireceği sonucu atamak için bir variable oluşturabilirim

        boolean asalSayımı=asalSayiMi(59);
        System.out.println(asalSayımı);
    }

    public static boolean asalSayiMi(int input) {
        boolean asalSayiMi = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) { // eger burasi calisirsa asal sayi degil
                asalSayiMi = false;
                break;
            }
        }
        return asalSayiMi;
    }
}





