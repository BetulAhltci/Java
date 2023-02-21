package day17_Arrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        //verilen iki MDA daki tüm sayıların toplamını yazdıran bir metod oluşturun

        tumSayılarıTopla(arr);//54

    }

    public static void tumSayılarıTopla(int[][]arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {//outer array

            for (int j = 0; j <arr[i].length ; j++) {//inner array

                toplam+=arr[i][j];


            }

        }
        System.out.println("Array'deki tüm sayıların toplamı: "+ toplam);
    }


}
