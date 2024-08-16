package Java_8_Features.Stream.Peek;

import java.util.ArrayList;
import java.util.List;

public class Peek {


public static void main(String[] args) {

    List<Integer> t = new ArrayList<>();
    t.add(59);
    t.add(50);
    t.add(36);
    t.add(45);
    t.add(67);


    System.out.println(t.stream().filter(e -> e%2 == 0 ).peek(System.out::println).map(s -> s+s));

}}


