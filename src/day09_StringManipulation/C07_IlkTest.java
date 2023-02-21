package day09_StringManipulation;

public class C07_IlkTest {
    public static void main(String[] args) {
        // gittiğimi web sayfasından aldığımız
        //string arama sonuçlarında
        //arama sayısının 50'den fazla olduğunu test edin

        String input="1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexresults= input.indexOf("results");

        String sonucsayısıStrıng=input.substring(indexOf+3,indexresults-1);
        int sonucsayısıInt=Integer.parseInt(sonucsayısıStrıng);

        if (sonucsayısıInt>50){
            System.out.println("nutella arma sonucu PASSED");
        }else{
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FALED");
        }




    }
}
