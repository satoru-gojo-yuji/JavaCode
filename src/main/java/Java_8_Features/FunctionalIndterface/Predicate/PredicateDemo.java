package Java_8_Features.FunctionalIndterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String args[])
    {
        Predicate<Integer> pr = (number) -> number > 20 ;    // number 20 ? ture : false ;
        System.out.println(pr.test(34));
    }
}
