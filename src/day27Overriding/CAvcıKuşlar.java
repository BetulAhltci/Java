package day27Overriding;

public class CAvcıKuşlar extends Bkuşlar{

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvcıKuşlar krt1 = new CAvcıKuşlar();

        krt1.hareket();//C den alır-ucarlar
        krt1.beslenme();//C- et yerler
        krt1.pence();//C-pencelidir
        krt1.gaga();//C-sivri gagali
        krt1.kanat();//B-kanatlidirlar
        krt1.solunum();//B-akcigerle nefes alirlar
        krt1.cogalma();//B-yumurtayla cogalirlar
        krt1.omur();//A-yasar ve olurler

        //Eğer contructor ve data türüaynı ise
        //özelliğin variable veya method olmasına bakılmaksızın
        //o class a gidilir, o class veya parent class'larda bulunan ILK DEĞER kullanılır

        Bkuşlar krt2=new CAvcıKuşlar();

        krt1.hareket();//C den alır-ucarlar
        krt1.beslenme();//C- et yerler
       // krt1.pence();//Bkuslar veya parent class da yok CTE verir
        krt1.gaga();//C-sivri gagali
        krt1.kanat();//B-kanatlidirlar
        krt1.solunum();//B-akcigerle nefes alirlar
        krt1.cogalma();//B-yumurtayla cogalirlar
        krt1.omur();//A-yasar ve olurler

        AHyavanlar krt3=new CAvcıKuşlar();

        krt3.hareket();//C den alır-ucarlar
        krt3.beslenme();//C- et yerler
        //krt3.pence();//AHayvanlarda yok /CTE
        //krt3.gaga();//AHayvanlarda yok /CTE
        //krt3.kanat();//AHayvanlarda yok /CTE
        krt3.solunum();//B-akcigerle nefes alirlar
        krt3.cogalma();//B-yumurtayla cogalirlar
        krt3.omur();//A-yasar ve olurler
    }

}
