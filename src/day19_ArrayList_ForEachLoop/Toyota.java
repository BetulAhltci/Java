package day19_ArrayList_ForEachLoop;

public class Toyota {

    String marka="Toyota";
    String model="Model belirtilmemiş";
    int yıl;
    int km;
    String renk;

    //default constructor suna benzer

  public Toyota(){
        System.out.println("toyota class ındaakı cons. çalıştı");
    }

    /*
    bir kod bloğunun constructor olup olmadığını anlamak için 2 şeye bakılır

        1-constructor class ismi ile aynı isimde olmalıdır
          dolayısıyla cons.isimleri büyük harfle başlar
        2-Constructor ların return type ı olmaz
     */

    /*
    Javada her class obje üretmek üzere oluşturulur

    bir obje oluşturup ilk değer ataması yapılabilmesi için
    MUTLAKA constructor calışmalıdır

    her clas'da bizim constructor oluşturmamıza gerek kalmaması için
     Java her class aotomatik olarak default contructor koyar

     default constructor GÖRÜNMEZ
       default constructor parametresi olmayan
       ve body sinde hiç kod bulunmayan bir constructor dur

       bir class da gözlerimile bir constructor görmuyorsak
       o class da default constructor vardır

       bir class da gözlerimile bir constructor göruyorsak
       o class da default constructor yoktur
     */
}
