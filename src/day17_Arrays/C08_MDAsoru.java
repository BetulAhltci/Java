package day17_Arrays;

import java.util.Arrays;

public class C08_MDAsoru {
    public static void main(String[] args) {
        /*
         Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
          yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
          input : int[][] arr = {{3,4,5},{2,3,6,7},};
          output: [5, 7, 11]
         */

        //dinamik hale getirebilmek için önce inner arraylerden en kısasını bulmak gerek

        int[][] arr = {{1,2,5},{1,2,6,7},{1,2}};

        int enKısaInnerArrayLenght=arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length<enKısaInnerArrayLenght){
                enKısaInnerArrayLenght=arr[i].length;
            }
        }
       //aynı indexdeki elementleri topladığımızda koyacağimiz tek katlı bir array oluşturalım

        int[] toplamlarArray= new int[enKısaInnerArrayLenght];
        int toplam=0;

        for (int i = 0; i <toplamlarArray.length ; i++) {

            for (int j = 0; j <arr.length; j++) {

                toplam+=arr[j][i];
            }
            toplamlarArray[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(toplamlarArray));







    }
}
