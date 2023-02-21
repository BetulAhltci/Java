package day12_MethodCreation;

public class C02_MethodOluşturma {
    public static void main(String[] args) {

        //verilen 2 sayıyı carpıp ssonucu "yazdıran" bir metod oluşturalım


        //oluşturulan metod main metodun dışında olmalı
        //bir metod ancak metod call yapıldığında çalışır
        //metod call için metod adı ve parametrelere uygun argüment yazılmalıdır

        carpYazdır(5, 8);//40.0
        carpYazdır(7.4, 8.6);//63.64
        //argümentler ile parametreler biribiriyle uyumlu olmalı
    }

        public static void carpYazdır(double sayı1,double sayı2){
        System.out.println(sayı1*sayı2);


    }


}
