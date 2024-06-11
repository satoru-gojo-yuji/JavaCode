package Java_8_Features.FunctionalIndterface.Predicate;

import java.util.function.Predicate;

public class Evenno {

    public static void main(String[] args)
    {
        Predicate<Integer> r = p-> p % 2 == 0 ;
        System.out.println(r.test(54));

        Predicate<Integer> e =i-> i % 2 == 0 ;
         boolean status = isEven(e,10);
        System.out.println(status);


    }


    public static boolean isEven(Predicate<Integer> p , Integer i)
    {
        return p.negate().test(i);
    }
}
