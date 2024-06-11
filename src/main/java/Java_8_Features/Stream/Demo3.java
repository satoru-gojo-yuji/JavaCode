package Java_8_Features.Stream;

import java.util.stream.Stream;

public class Demo3 {

    public static void main(String[] args)
    {
        Stream<Integer> r = Stream.of(4,3,7,8,9);
        r.filter(e -> e>=4)
        .forEach(System.out::println);


    }
}
