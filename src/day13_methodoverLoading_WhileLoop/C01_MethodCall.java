package day13_methodoverLoading_WhileLoop;

import day12_MethodCreation.C03_AsalSayı;
import day12_MethodCreation.C07_TerseÇevirme;
import day12_MethodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {



        // ilk 15 fibonacci sayisini yazdirin
        C09_FibonacciSerisi.fibonaccidenSayiYazdir(10); // 0 1 1 2 3 5 8 13 21 34

        // asagida verilen cumlenin tersini yazdirin
        String str= "Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TerseÇevirme.metniTerseCevir(str));
        String tersstr=C07_TerseÇevirme.metniTerseCevir(str);
        System.out.println(tersstr);// miratay rileg nay ,mirapay erek riB


        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        str= "Java Candir";
        tersstr=C07_TerseÇevirme.metniTerseCevir(str);//Palindrome degil

        if (str.equals(tersstr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome degil");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin
        int sayi= 230;
        System.out.println(C03_AsalSayı.asalSayiMi(sayi)); //

        // kullanici true / false dan bir sey anlamaz , acik sekilde yazalim dersek
        boolean sonuc= C03_AsalSayı.asalSayiMi(sayi); // false
        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal.");
        }else {
            System.out.println("Girilen " + sayi + " asal sayi degil.");
                }
            }
        }




