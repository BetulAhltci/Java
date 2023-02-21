package day09_StringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
         String str="Java mutluluktur";

        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("j"));//false

        System.out.println(str.startsWith("Java mutluluktur"));//true

        System.out.println(str.startsWith(""));//true

        System.out.println(str.contains("mutlu"));//true mutlu içerirmı
        System.out.println(str.startsWith("mutlu"));//false muylu ile başlarmı

        System.out.println(str.startsWith("mutlu",5));//true 5. index ve sonrası mutlu ile başlarmı
        System.out.println(str.startsWith("va",2));//true

    }
}
