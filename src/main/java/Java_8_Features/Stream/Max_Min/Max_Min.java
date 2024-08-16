package Java_8_Features.Stream.Max_Min;

import java.util.ArrayList;
import java.util.List;

public class Max_Min {

    public static void main(String[] args) {


        List<Integer> t = new ArrayList<>();
        t.add(59);
        t.add(50);
        t.add(36);
        t.add(45);
        t.add(67);

        System.out.println(t.stream().min(Integer::max).get());


        System.out.println(t.stream().reduce(Integer::min));

    }
}
