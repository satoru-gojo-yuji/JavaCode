package Java_8_Features.Stream.Count;

import java.util.ArrayList;
import java.util.List;

public class Count {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(5);
        t.add(5);
        t.add(36);
        t.add(5);
        t.add(5);

        System.out.println(t.stream().filter(r-> r>=36).count());

    }
}
