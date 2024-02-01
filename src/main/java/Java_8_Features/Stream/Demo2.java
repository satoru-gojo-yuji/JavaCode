package Java_8_Features.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.s;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
      //  Stream<Integer> a = Stream.of(4, 5, 6, 7, 8, 83);
        // a.forEach(System.out::println);



        List<String> s = new ArrayList<>();

        s.add("anusa");
        s.add("anuiu");
        s.add("anuty");
        s.add("anusg");
        s.add("anu");
        s.add("anurt");

        Stream<String> s3 = s.stream();
        Stream<String> f =s3.filter( r->r.startsWith("a") );
       // f.forEach(System.out::println);
        f.forEach(t -> System.out.println(t));





    }
}
