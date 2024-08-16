
package Java_8_Features.Stream.Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(5);
        t.add(5);
        t.add(36);
        t.add(5);
        t.add(5);

        List<Integer> collect = t.stream().filter(r -> r > 5).toList();
//        collect.forEach(System.out::println);
//
//
//        List<Integer> collect1 = t.stream().map(r -> r * r)
//                .filter(r -> r > 5).toList();
//        collect1.forEach(System.out::println);


        List<Integer> i = t.stream().map(x -> x * x).filter(d -> d >= 100).toList();
          i.forEach(System.out::println);

    }
}
