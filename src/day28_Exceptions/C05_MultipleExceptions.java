package day28_Exceptions;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class C05_MultipleExceptions {
    public static void main(String[] args) {

        /*
        Eğer birden fazla exception oluşma ihtimalı varsa e bu exceptionlar birbirinden bağımsız ise

        1- tek try istenen kadar catch yapılabilir
        2- ikisi icin ic ice try catch yapabilirim
        3- iki exception'i da kapsayan tek bir catch yapabilirim
         */

        String str = "Java'dacok fazla exception var";
        int[] arr = {3, 5, 1, 3, 2, 6, 3, 6, 8, 5, 2};
        //kullanıcıdan bir tamsayı alın
        //ve girilen sayıyı index olarak kullanıp str ve arr den o index deki elementleri yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir index girin");
        int index = scan.nextInt();

        // System.out.println("String'den istenen index'deki element: "+str.substring(index,index+1));
        //System.out.println("Arrayden istenen indexdeki element: "+arr[index]);

        //1. çozum

      /*  try {
            System.out.println("String'den istenen index'deki element: " + str.substring(index, index + 1));
            System.out.println("Arrayden istenen indexdeki element: " + arr[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("istenen index Stringin sınırları dışında");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("istenen index array in sınırları dısında");
        }*/

        //2.cçzum ic ice try catch

      /*  try {
            try {
                System.out.println("String'den istenen index'deki element : " + str.substring(index,index+1));
                System.out.println("Array'den istenen index'deki element : " + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("istenen index String'in sinirlari disinda");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("istenen index array'in sinirlari disinda");
        }
         */

        // 3. cozum tek ama daha kapsamli bir exception kullanma
        try {
            System.out.println("String'den istenen index'deki element : " + str.substring(index, index + 1));
            System.out.println("Array'den istenen index'deki element : " + arr[index]);
        }catch(RuntimeException e){
            System.out.println("index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }
    }
}
