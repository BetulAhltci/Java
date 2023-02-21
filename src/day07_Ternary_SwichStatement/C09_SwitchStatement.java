package day07_Ternary_SwichStatement;

public class C09_SwitchStatement {
    public static void main(String[] args) {
        // kullanıcıdan gün numarası alın
        //gun ismini yazdırın

        int gunno = 3;

        switch (gunno) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gün sayısı geçersiz");
        }
    }
}

