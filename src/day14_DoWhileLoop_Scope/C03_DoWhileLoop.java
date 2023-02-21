package day14_DoWhileLoop_Scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //verilen başlangıç ve bitiş karakterleri dahil aradaki tüm karakterleri yazdırın

        char baslangıc='d';
        char bitis='m';

        do {
            System.out.print(baslangıc+" ");
            baslangıc=(char)(baslangıc+1);

        }while (baslangıc<=bitis);




    }
}
