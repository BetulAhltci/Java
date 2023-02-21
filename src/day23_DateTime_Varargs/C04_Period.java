package day23_DateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumtarihi= LocalDate.of(1995,8,12);
        LocalDate bugun=LocalDate.now();

        Period yas= Period.between(dogumtarihi,bugun);
        System.out.println(yas);//P27Y4M8D
        System.out.println(yas.getYears());//27

        LocalDate baslangıc=LocalDate.of(2010,8,5);
        LocalDate bitiş=LocalDate.of(2015,7,20);
        Period süre=Period.between(baslangıc,bitiş);
        System.out.println(süre);//P4Y11M15D
    }
}
