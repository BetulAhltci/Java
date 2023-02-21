package day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Size {
    public static void main(String[] args) {
        List<Integer> sayılar= new ArrayList<>();

        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);

        System.out.println(sayılar.size());//4

        sayılar.clear();//listedeki tüm elementleri siler

        System.out.println(sayılar.size());//0

        System.out.println(sayılar);//[]
    }
}
