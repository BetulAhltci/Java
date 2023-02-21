package day14_DoWhileLoop_Scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan bir pozitif sayi isteyin,
         sayının tam kare olup olmadığını bulunuz,
         tamkare ise true değilse false yazdırınız.
         Ornek : input : 16, output: 4
         */

        int input=36;
        int karekok=1;
        boolean sonuc= false;
        while (karekok*karekok<=input){
            if (karekok*karekok==input){
                System.out.println("girilen sayının karekökü: "+ karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }
        }
        System.out.println(sonuc);

        // do while loop çözumu

        input=144;
        karekok=1;
        sonuc= false;

        do{
            if (karekok*karekok==input){
                System.out.println("girilen sayının karekökü: "+ karekok);
                sonuc=true;
                break;
            }else {
                karekok++;}

        }while (karekok*karekok<=input);
            System.out.println(sonuc);



    }
}
