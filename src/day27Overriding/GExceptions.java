package day27Overriding;

public class GExceptions {
    public static void main(String[] args) {
        int a=23;
        int b=0;
        //System.out.println("iki sayının bölümü: "+a/b);//ArithmeticException: / by zero

        //bölen sayını 0 olması bu kodda öngürülebilecek bir risk dir
        //ve kodu yazarken buriski cözecek sekilde kod yazabiliriz

        if(b!=0){
            System.out.println("iki sayının bölümü: "+a/b);
        }else {
            System.out.println("bölecek sayı 0 olamaz");
        }

    }
}
