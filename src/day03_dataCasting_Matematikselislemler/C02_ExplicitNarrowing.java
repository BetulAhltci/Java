package day03_dataCasting_Matematikselislemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl= 23.5;
        int sayı=(int)dbl;
        System.out.println(sayı);//23

        byte sayıbyt=(byte) sayı;
        System.out.println(sayıbyt);//23


        sayı=130;
        sayıbyt=(byte)sayı; //int byte dan daha kapsamlı olduğu için otomatik çeviri yapmaz müdahale ister
        System.out.println("int 130 un byte hali:"+sayıbyt);//-126

        sayı=256;
        sayıbyt=(byte)sayı;
        System.out.println("int 256 nın byte hali :"+sayıbyt);//128 in tam katı olduğundan sonuç 0







    }
}
