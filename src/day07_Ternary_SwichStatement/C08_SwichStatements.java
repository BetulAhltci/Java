package day07_Ternary_SwichStatement;

public class C08_SwichStatements {
    public static void main(String[] args) {
        //kullanıcıdan ki sayı alın ve kullanıcıya istediği işlemi sorun
        //+,-,*,/ işaretlerinden hangini girerse 2 sayı için o işlemi yapın
        // bu işaretlerden birini girmezse"yanlış işlem tercihi"yazdırın


        int sayı1=20;
        int sayı2=10;
        char işlem='+';

        if (işlem=='+'){
            System.out.println("sayıların toplamı:"+(sayı1+sayı2));
        }else if(işlem=='-'){
            System.out.println("sayıların farkı:"+(sayı1-sayı2));
        }else if (işlem=='*'){
            System.out.println("sayıların çarpımı."+(sayı1*sayı2));
        }else if (işlem=='/'){
            System.out.println("sayıların bölümü:"+(sayı1/sayı2));
        }else{
            System.out.println("yanlış işlem tercihi");
        }


        switch (işlem){
            case'+':
                System.out.println("sayıların toplamı:"+(sayı1+sayı2));
                break;
            case'-':
                System.out.println("sayıların farkı:"+(sayı1-sayı2));
                break;
            case'*':
                System.out.println("sayıların çarpımı."+(sayı1*sayı2));
                break;
            case'/':
                System.out.println("sayıların bölümü:"+(sayı1/sayı2));
                break;
            default:
                System.out.println("yanlış işlem tercihi");






        }

    }
}
