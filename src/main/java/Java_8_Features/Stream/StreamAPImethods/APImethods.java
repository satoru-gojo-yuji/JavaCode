package Java_8_Features.Stream.StreamAPImethods;

import java.util.ArrayList;
import java.util.List;

public class APImethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("India");
        list.add("China");
        list.add("USA");
        list.add("UK");
        list.add("China");
        list.add("India");


    //    list.stream().distinct().forEach(System.out::println);

    //    list.stream().limit(3).forEach(r -> System.out.println(r));

        list.stream().skip(3).forEach(System.out::println);

    }
}
