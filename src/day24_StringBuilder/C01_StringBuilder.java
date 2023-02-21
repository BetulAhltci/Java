package day24_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();//kapasitesi  16 olan bir StringBulilder oluşturur
        System.out.println(sb1);//boş satır yazdırır
        System.out.println(sb1.capacity());//16


        StringBuilder sb2= new StringBuilder(11);
        System.out.println(sb2);//boş satır yazdırır
        System.out.println(sb2.capacity());//11


        StringBuilder sb3= new StringBuilder("Java Candır");
        System.out.println(sb3);//Java Candır
        System.out.println(sb3.capacity());//27


        sb2.append("Java");
        System.out.println(sb2);//Java



    }
}
