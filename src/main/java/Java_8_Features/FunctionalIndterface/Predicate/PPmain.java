package Java_8_Features.FunctionalIndterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PPmain {

    public static void main(String args[])
    {
        PPerson p1 = new PPerson("Raja", 5) ;
        PPerson p2 = new PPerson("Ra", 18) ;
        PPerson p3 = new PPerson("ja", 20) ;
        PPerson p4 = new PPerson("aja", 56) ;
        PPerson p5 = new PPerson("aaja", 58) ;


       List<PPerson>  t = Arrays.asList(p1,p2,p3,p4,p5);    // Convert object into arrylist

        Predicate<PPerson> persona = (P) -> P.getage() >= 18 ;
        Predicate<PPerson> persona1 = (P) -> P.getage() <=64 ;

        for(PPerson p : t)
        {
            Predicate<PPerson> personal3 = persona.and(persona1);
             boolean s = personal3.test(p);
             if(s)
                 System.out.println(p.getName());
        }



    }
}
