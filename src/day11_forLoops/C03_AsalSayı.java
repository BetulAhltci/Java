package day11_forLoops;

public class C03_AsalSayı {
    public static void main(String[] args) {

        //input olarak verilen bir tam sayının asal sayı olup olmadığını yazdırın

        int input=19;
        String sonuç="Sayı asal";

        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                sonuç="Sayı asal değil";
                break;
                //java bir loop un içerisinde break görürse o loop u bitirir. sartı sağlayan unsuru bulduktan sonra
            }
        }
        System.out.println(sonuç);
    }
}
