package day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,6}};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@58ceff1

        //multi dimensional array ile çalışırken dikkat etmemiz gereken en önemli konu
        //yazdığımız kodun bir array mi yoksa yazdırabileceğimiz bir element mi döndürdüğüdür

        System.out.println(Arrays.toString(arr[3]));//[2]

        //17. satırdaki 2 elementini yadırmak istersek
        System.out.println(arr[3][0]);//2

        //MDA in tümünu yazdırmak isterseniz
        //tek katlı arrayleri yazdırmak için kullandığımız yntem yeterli olmaz

        System.out.println(Arrays.toString(arr));//[[I@7c30a502, [I@49e4cb85, [I@2133c8f8, [I@58ceff1, [I@43a25848]
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 6]]





    }
}
