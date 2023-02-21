package day21_statikKeyworld;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s=20;

        System.out.println(s);//20

        //int s=30;
        //bir scope da tanımlanan variable ın yeniden tanımlama imkanı yoktur

        //String s="hasan";
        //data türünü değiştirerek yeniden sanımlamak da mümkün değildir
        //cünkü kullanırken variable ın ismini yazdığımızda hangi s varıable ını kullanacağı mechul olur

        metod1();
    }
    public static void metod1(){

        String s="hasan";
        System.out.println(s.toUpperCase());//HASAN

    }
    public static void metod2(int s){
        s=s*s;
        System.out.println(s);

    }






}
