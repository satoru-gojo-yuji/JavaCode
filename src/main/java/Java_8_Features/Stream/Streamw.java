package Java_8_Features.Stream;

import java.util.stream.Stream;

public class Streamw {

    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(2,4 , 6, 77 ,5,  3,3 );
        stream.filter(i-> i>=6)
                .forEach(i -> System.out.println(i));


    }
}
