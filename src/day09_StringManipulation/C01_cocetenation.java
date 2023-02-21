package day09_StringManipulation;

public class C01_cocetenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="candır";

        System.out.println(str1+" "+str2);//Jva candır

        System.out.println(str1.concat(str2));//Javacandır

        System.out.println(str1.concat(" ").concat(str2));//Java candır

    }
}
