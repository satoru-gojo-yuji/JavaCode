package Java_8_Features.FunctionalIndterface.Function;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args)
    {
        Function<String , String> t = (r) -> r.toUpperCase();
        System.out.println(t.apply("Agdfrvf"));
    }
}
