package day07_Ternary_SwichStatement;

public class C10_SwitchStatements {
    public static void main(String[] args) {
        // kullanıcıdan gün numarası alın
        //haftaiçi içim "haftaiçi" haftasonu için"haftasonu" yazdırın

        int gunno = 5;

        switch (gunno) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;
            default:
        }
    }
}
