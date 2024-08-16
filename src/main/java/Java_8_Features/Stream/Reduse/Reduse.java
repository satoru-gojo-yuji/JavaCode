package Java_8_Features.Stream.Reduse;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Reduse {

    public static void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(59);
        t.add(50);
        t.add(36);
        t.add(45);
        t.add(67);


        out.println(t.stream().reduce((a,b)-> a*b ));


        out.println(t.stream().max(Integer::compareTo));
    }
}
