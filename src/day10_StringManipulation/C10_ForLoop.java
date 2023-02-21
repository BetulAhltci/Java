package day10_StringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {

        // imput olarak verilen sayıdan başlayıp
        // 7 'şer arttırarak imput olarak verilen bitiş sayısına kadar
        //-tüm sayıları
        //-kaç adet sayı olduğunu
        //-bu sayıların toplamının kaç olduğunu yazdırın

        int inputBas=34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i +" ");
            sayac++;
            toplam+=i;}
            System.out.println("");
            System.out.println("toplam"+sayac+"adet sayı var\nbu sayıların toplamı:"+toplam);

    }
}
