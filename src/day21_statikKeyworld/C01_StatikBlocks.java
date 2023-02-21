package day21_statikKeyworld;

public class C01_StatikBlocks {

    C01_StatikBlocks(){
        System.out.println("Constructor calıstı");
    }

    public static void main(String[] args) {
        System.out.println("Main metod calışmaya başladı");
    }
    static {
        //Static block lar class takı tüm yapılardan hatta main metoddan bile önce calısır
        //static block da istediğimiz bir variable a başlangıc değeri atanmaı
        //kullanıcıdan yetki sorgulaması gibi işlemler yapılır
        //main metod calışmadan önce yapılması gereken işlem olduğunda kullanılır
        //metodların ve statik block ların sıralaması java acısından önemli değildir
        //ancak birden fazla static block varsa kendi aralarında üstte olan önce calısır
        System.out.println("Yukarıdaki Static block calıştı");
    }
    static {
        System.out.println("alttaki statik block çalıştı");
    }
}
