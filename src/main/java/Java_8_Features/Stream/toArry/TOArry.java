package Java_8_Features.Stream.toArry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TOArry {
    public static <object> void main(String[] args) {

        List<Integer> t = new ArrayList<>();
        t.add(59);
        t.add(50);
        t.add(36);
        t.add(45);
        t.add(67);

       Object[] r = t.stream().toArray();
       for(Object o : r)
       {
           System.out.println(o);
       }

    }
}
