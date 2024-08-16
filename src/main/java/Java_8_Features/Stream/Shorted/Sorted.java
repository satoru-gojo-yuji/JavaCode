package Java_8_Features.Stream.Shorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(59);
        t.add(50);
        t.add(36);
        t.add(45);
        t.add(67);


        t.stream().sorted().forEach(System.out::println);


        t.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(System.out::println);

        t.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
