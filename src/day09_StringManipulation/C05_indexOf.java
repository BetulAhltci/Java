package day09_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java ile codlama cok kolay";

        //str "cok" içeriyormu
        System.out.println(str.contains("cok"));//true

        //kullanıcıdan aldığınız cumle "cok" ile başlayaan ilk kelimeyi yazdırın
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("cok"));//17

        System.out.println(str.indexOf("a",5));//13 5. index den sonra ilk a yı bulur

        //2. o nun index ini bulunuz
        //önce ilk o nun index ini buluruz
        //sonra o indexden sonrakı ikinci o yu aratırız

        int ilkoindex=str.indexOf("o");//10
        System.out.println(str.indexOf("o",11));//18
    }
}
