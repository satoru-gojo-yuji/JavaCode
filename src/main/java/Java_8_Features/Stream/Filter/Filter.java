package Java_8_Features.Stream.Filter;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(5);
        t.add(5);
        t.add(36);
        t.add(5);
        t.add(5);

        t.stream().filter(r -> r>5).forEach( s -> System.out.println(s));
    }
}
