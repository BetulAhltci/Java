package day16_Arrays;

public class C07_ArraySoru {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={2,3,4,2,5,2,4,6,3,1,9};
        int arananSayı=2;
        elemanBul(arr,2);//aradığınız 2 array'de 3 adet kullanılmıştır
        elemanBul(arr,8);//aranan sayı array'de yok

    }

    public static void elemanBul(int[]arr,int arananSayı) {

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananSayı){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("aranan sayı array'de yok");
        }else{
            System.out.println("aradığınız "+arananSayı+" array'de "+sayac+" adet kullanılmıştır");
        }
    }


}
