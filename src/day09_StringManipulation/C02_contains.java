package day09_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str="Java ogren mutlu ol";

        //str mutlu içeriyormu
        System.out.println(str.contains("mutlu"));//true

        //charsequence: char dizisi

        System.out.println(str.contains("j"));//false
        System.out.println(str.contains(" "));//true

        //contains metodu kaç tane olduğuna değil,
        //sadece varolupolmadığına bakar

        System.out.println(str.contains("Java")&&str.contains("yaşa"));//false
        System.out.println(str.contains("Java")||str.contains("yaşa"));//true
    }

}
