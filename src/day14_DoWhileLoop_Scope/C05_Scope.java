package day14_DoWhileLoop_Scope;

public class C05_Scope {

    int sayı=10;
    static  int number;


    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
       // sayı=20;
       // System.out.println(method2str);

        for (int i = 0; i <10 ; i++) {
            int toplam=i;
        }
        //System.out.println(toplam);
        //System.out.println(i);

    }
    public static void method1(){
        String method1Str="Güzeldir";
        number=20;
       // sayı=14;
       // System.out.println(mainStr);
    }
    public void method2(){
        String method2Str="Candır";
        number=30;
        sayı=30;
       // System.out.println(mainStr);

    }


}
