package Java_8_Features.FunctionalIndterface.Bipredicate;

import java.util.function.BiPredicate;

public class Demo {

    public static void main(String[] args)
    {
        BiPredicate<Integer, Integer> t =(i , y) -> i+y >= 100 ;
        System.out.println(t.test(50 ,60));
    }
}
