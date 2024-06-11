package Java_8_Features.FunctionalIndterface.Consumer;

import java.util.function.Consumer;

public class Demo1 {

    public static void main(String[] args)
    {
        Consumer<String> s =(name) -> System.out.println("Hello");
        s.accept("Abhi");

        Consumer<Integer> s1 =(name1) -> System.out.println(name1*name1);
        s1.accept(20);
    }
}
