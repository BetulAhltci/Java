package day10_StringManipulation;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str="##Java heyecandır";

        //eğer tüm a ları değilde sadece ilk a yı değştirmek için kullanılır

        System.out.println(str.replaceFirst("a","A"));//JAva heyecandır

        //ilk harf veya rakamı * yap

        System.out.println(str.replaceFirst("\\w","*"));//##*ava heyecandır

    }
}
