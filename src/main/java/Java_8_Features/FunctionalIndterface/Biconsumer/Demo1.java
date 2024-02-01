package Java_8_Features.FunctionalIndterface.Biconsumer;

import java.util.function.BiConsumer;

public class Demo1 {

    public static void main(String[] args)
    {
        BiConsumer<Integer, Integer> r1 = (i , r ) -> {
            System.out.println("Hello");
            System.out.println("HI");

    };
        r1.accept(19,20);
    }
}
