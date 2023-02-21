package day19_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[] arr={2,3,4,6,3,4,6,1,8,5,4};

        List<Integer> list1=new ArrayList<>();

        //array deki tüm elementleri liste kopyalayalım

        for (Integer each:arr
             ) {
            list1.add(each);
        }
        System.out.println(list1);

        //arraydeki cift sayıları bir list e tasıyalım

        List<Integer> ciftSayılarList=new ArrayList<>();

        for (Integer each:arr
             ) {

        }


        }
    }

