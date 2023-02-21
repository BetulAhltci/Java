package day22_PassByValue;

import java.util.Arrays;

public class C02_ImmutableClasses {
    public static void main(String[] args) {

        String str= "Java";
        System.out.println(str.toUpperCase());//JAVA

        str.toUpperCase();
        System.out.println(str);//Java

        //String ımmutable olduğundan, metodlar kalıcı değişiklik yapamaz

        int[] arr={9,5,17};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[5, 9, 17]

        //Array mutable bir class olduğundan metod ile yaptığımız değişiklikler kalıcı olur
    }
}
