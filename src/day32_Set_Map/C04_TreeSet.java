package day32_Set_Map;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {
    public static void main(String[] args) {

        Set<Integer> sirali=new TreeSet<>();

        sirali.add(13);
        sirali.add(34);
        sirali.add(1);
        sirali.add(55);
        sirali.add(7);
        System.out.println(sirali);//[1, 7, 13, 34, 55]
    }
}
