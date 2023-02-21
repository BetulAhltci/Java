package day15_Scope_Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //int arr={1,2,3};
        int[] arr={1,2,3};
        int arr2[]={4,5,6,7,8,9};//bu şekilde yazıldığında kaç element yazıldı ise onu lenght kabul eder

        String[] harfler= new String[4000];

        System.out.println(arr.length);//3
        System.out.println(arr2.length);//6
        System.out.println(harfler.length);//4000

        //String de kullandığımız harfler.lenght() bir metod iken
        //array deki lenght metod değil variable dır(arr.lenght)


    }
}
