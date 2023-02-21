package day20_Construktor;

public class Car {
    /*
    bir class dan oluşturulabicek objelerin özelliklerini
    variable veya metodlarla belirleyebiliriz
     */

    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    int yıl = 1900;
    int km;
    String renk = "Renk seçilmeli";

    public Car(String marka, String model, int yıl) {
        this.marka=marka;
        this.model=model;
        this.yıl=yıl;


    }

    public static void hareket() {
        System.out.println("tüm arabalar hareket eder");
    }

    public  Car(){

    }

    public Car(String mrk,String mdl,String rnk,int kmetre,int yl){
        marka=mrk;
        model=mdl;
        renk=rnk;
        yıl=yl;
        km=kmetre;
    }

    public Car(String marka, String model, int yıl, String renk) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.renk = renk;
    }
    /*
    bir class da görümür bir contructor oluşturduğumuzda Java default contructor u siler siler
    bu durumda daha önceden default constructor  u kullanarak obje olluşturulan class larda CTE oluşur







    Constructor da parametre olarak kullanıcıdan gelen değeri class level deki inctance variable a atamalıyız
    Eğer parametre ismi ile instance variable ismi farklı ise sorun yok java otomatik olarak atatmamızı anlar

    Eğer parametre isimlerinin anlaşılır olması için instance variable ile aynı yaparsak



 */



    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yıl=" + yıl +
                "\n, km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }





}
