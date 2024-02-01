package Java_8_Features.Stream;

import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args)
    {
        Stream<Integer> a = Stream.of(4,5,6,7,8,83) ;
       // a.forEach(System.out::println);


        a.filter(i -> i >=6)
                .forEach(i -> System.out.println(i));

        //.forEach(i -> System.out::println(i));
/*
        Stream<Integer> a1 = a.filter(i -> i >= 6);
        a1.forEach(i -> System.out.println(i));*/

    }

}
