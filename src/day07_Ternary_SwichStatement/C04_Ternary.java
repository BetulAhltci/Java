package day07_Ternary_SwichStatement;

public class C04_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan alınan değer
        //100'den büyük ise 2 ile çarpın
        //100'den küçük ise sayıya 10 ekleyin

        int input=45;

        if(input>100){
            input*=2;
        }else{
            input+=10;
        }
        System.out.println("if else ile:"+input);

        input=45;

        input= input>100? input*2 : input+10;

        System.out.println("ternary ile:"+input);

        /* verilen inputu inceleyin
        eğer 100'den büyükse bunu 5'e bölüp bölüm sonucunun tek sayı olup olmadığını kontrol edin
        eğer 100'den büyük değise 10 ile bölümünden kalanını bulup , bu kalani 5 arttırın


        bu tür komleks işlemleri ternary ile yapmayız

         */
    }
}
