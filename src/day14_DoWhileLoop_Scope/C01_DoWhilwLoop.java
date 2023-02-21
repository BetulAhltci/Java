package day14_DoWhileLoop_Scope;

import java.util.Scanner;

public class C01_DoWhilwLoop {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayı alın
        //kullanıcı değer olaral 0 a basarsa işlemi bitirin

        int girilensayı=0;//degere 0 atadığımız için loop çalışmaz. 0 dan başka her değer için calısır
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        while (girilensayı!=0){
            System.out.println("lütfen toplanmak üzere bir tam sayı giriniz");
            girilensayı=scan.nextInt();
            toplam+=girilensayı;
        }
        System.out.println("girilen sayıların toplamı : "+ toplam);

        /*
        While loop un iki tane yönü vardır
        1- loop dan önce oluşturduğumuz ve loop da kullanacağımız variable lara
        yanlış değer değer verirsek loop clışmayabilir
        bu negatif yönler onu kullanılmaz yapacak büyüklükte değildir
        ancak  bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
         */




    }
}
