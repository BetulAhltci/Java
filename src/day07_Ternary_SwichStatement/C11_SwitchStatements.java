package day07_Ternary_SwichStatement;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        char harf='q';

        switch (harf){
            case 'ı':
            case 'I':
                System.out.println("International");
                break;
            case 's':
            case 'S':
                System.out.println("Software");
                break;
            case 't':
            case'T':
                System.out.println("Testing");
                break;
            case 'q':
            case'Q':
                System.out.println("Qualifications");
                break;
            case 'b':
            case 'B':
                System.out.println("Board");
            default:}


    }
}
