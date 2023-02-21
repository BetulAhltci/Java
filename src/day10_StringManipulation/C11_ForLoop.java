package day10_StringManipulation;

public class C11_ForLoop {
    public static void main(String[] args) {

        //verilen sayının faktöriyelini hesaplayın

        int input=6;
        int carpım=1;

        for (int i = input; i >=1 ; i--) {
            carpım*=i;
        }

        System.out.println("verilen"+input+"sayısının faktöriyeli:"+carpım);
    }
}
