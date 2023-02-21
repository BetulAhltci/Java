package day23_DateTime_Varargs;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-12-20T12:28:49.376487900

        System.out.println(ldt.getDayOfWeek());//TUESDAY

        System.out.println(ldt.withYear(2030));//2030-12-20T12:33:26.183900



    }
}
