package day04_Increment_Concatenation;

public class C02_pre_Postincrement {
    public static void main(String[] args) {
        int a= 10;
        int b= a++;// önce b ye a nın değerini ata sonra bir arttır_ b=10 a=11
        int c= ++a;//önce c yı arttır sonra ata_ a=12 c=12
        System.out.println(a+ "," +b+ "," +c);

        int x=20;
        int y=++x;//x değerini önce bir arttirir sonr atar(y=21 x=21)
        int z=y++;//y değerini önce z ye atar sonr a y yi bir arttirir(z=21 y=22)
        System.out.println(x+","+y+","+z);


        int k=30;
        System.out.println(k++);//önce yazar sonra arttırır.30 yazdırır ama k=31
        System.out.println(++k);//önce artırır sonra yazdırır.k=32 atar 32 yazdırır
        System.out.println(k++);//önce atar ve yadırır. sonra artırır.32 yazar k=33
        System.out.println(k);//33


        int sayı1=40;
        int sayı2=sayı1++;//sayı2=40 sayı1=41
        int sayı3=--sayı2;//sayı3=39 sayı2=39
        int sayı4=--sayı1;//sayı4=40 sayı1=40
        System.out.println(sayı1+","+sayı2+","+sayı3+","+sayı4);//40,39,39,40


    }
}
