package day28_Exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str="25";

        //str'a sayısal olarak 5 ekleyip yazdırın

        System.out.println(Integer.parseInt(str)+5);

        //Eğer str içinde sayı olmayan bir karakter olursa NumberFormatException olur

        Object sayıObj=str;
        Integer sayıInt=(Integer) sayıObj;
        System.out.println(sayıInt);//ClassCastException
    }
}
