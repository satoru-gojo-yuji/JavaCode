package Java_8_Features.Stream.Date_Time.Demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class Demo {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);


        //
        LocalDate r = LocalDate.now();
        System.out.println(r);

        LocalDate g = LocalDate.of(2020,12,23);
        System.out.println(g);

        g  = LocalDate.parse("2015-12-23");
        System.out.println(g);

        g =g.plusDays(4);
        System.out.println(g);

        LocalTime r2 =LocalTime.now();
        System.out.println(r2);

        Period fo = Period.ofDays(5);
        System.out.println(fo);

          Period r3 =Period.between(LocalDate.parse("1998-12-26" ),LocalDate.now());
        System.out.println(r3);

    }
}
