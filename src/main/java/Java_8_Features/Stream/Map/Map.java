package Java_8_Features.Stream.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(5);
        t.add(5);
        t.add(36);
        t.add(5);
        t.add(5);

    //    t.stream().map(i-> i*2).forEach(c -> System.out.println(c));


        List<Integer> r =t.stream().map(i-> i*2).collect(Collectors.toList());

        System.out.println(r);


    }
}
