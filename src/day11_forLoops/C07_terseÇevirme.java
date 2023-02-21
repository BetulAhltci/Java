package day11_forLoops;

public class C07_terseÇevirme {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String str="Java öğrenmek için çok çalışmak laım";

        String tersstr="";

        for (int i = str.length()-1; i >= 0; i--) {
            tersstr+=str.substring(i,i+1);

        }
        System.out.println(tersstr);

    }
}
