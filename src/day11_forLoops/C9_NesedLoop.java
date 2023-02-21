package day11_forLoops;

public class C9_NesedLoop {
    public static void main(String[] args) {

        //input olarak verilen kenar uzunluklarına göre aşağıdaki şekli çizdirin

        int kısakenar=5;
        int uzunkenar=8;

        /*
                * * * * * * * * //bir satırı nasıl yazdıracağımızı inner loop la belirleriz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *

            satırda yaptığımız işlemi kaç kere tekrar edeceğimizi ise outer loop belirler



        */

        for (int i = 1; i <=kısakenar ; i++) {
            for (int j = 1; j <=uzunkenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");//satırla işimiz bittiğinde alt satıra gecmek için

        }



        }
    }

