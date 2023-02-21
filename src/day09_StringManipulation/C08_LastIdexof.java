package day09_StringManipulation;

public class C08_LastIdexof {
    public static void main(String[] args) {
        String str="Javayı öğrenmek cok calışmam lazım cok.";

        //ilk a nın index i
        System.out.println(str.indexOf("a"));
        //son a nın index ini yazdırın
        System.out.println(str.lastIndexOf("a"));

        str.lastIndexOf("a",15);

        //verilen str de cokkelımesının kullanımını kotrol edip
        //-cok kelimesi kullanılmıs
        //-bir kere kullanılms
        //-bieden fazla kullanılmış
        //sonuçlarından uygun olanı yazdırın

        int ilkcokIndex=str.indexOf("cok");
        int soncokInde=str.lastIndexOf("cok");


        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanılmamıs");
        }else if(ilkcokIndex==soncokInde){
            System.out.println("cok kelimesi bir kere kllanılmış");
        }else{
            System.out.println("cok kelimesi birden fala kullanılmıs");
        }
    }
}
