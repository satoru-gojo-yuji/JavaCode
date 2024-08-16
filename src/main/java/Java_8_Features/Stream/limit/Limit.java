package Java_8_Features.Stream.limit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(5);
        t.add(5);
        t.add(36);
        t.add(5);
        t.add(5);

        System.out.println(t.stream().filter(a -> a>5).limit(1).toList());

    }
}
