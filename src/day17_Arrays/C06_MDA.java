package day17_Arrays;

public class C06_MDA {
    public static void main(String[] args) {

        //verilen iki katlı String bir array'de
        //isrenen metni içeren elementleri yazdıran bir metod olusturun

        String[][] arr={{"Ali","Zafer"},{"Betül","Hüseyin","Hasan"},{"Said"}};
        String arananMetin="a";

        istenenElementleriYazdır(arr,arananMetin);//Zafer Hasan Said
        istenenElementleriYazdır(arr,"e");//Zafer Betül Hüseyin
        istenenElementleriYazdır(arr,"Ali");//Ali


    }

    public static void istenenElementleriYazdır(String[][]arr,String arananMetin){

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j]+" ");
                }



            }

        }
        System.out.println("");
    }





}
