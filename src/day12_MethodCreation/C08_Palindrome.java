package day12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        //erilen bir String in palidrom olup olmadığını yazdırın
        //düz okunusu ile ters okunuşu aynı olan

        String str="Bu metodlar ne güelmiş";

        String tersstr=C07_TerseÇevirme.metniTerseCevir(str);

        if (str.equals(tersstr)){
            System.out.println("verilen metin palindrome");
        }else{
            System.out.println("verilen metin palindrome değil");
        }



    }
}
