package CodingQ;

//How do you remove duplicate elements from a list using Java 8 streams?

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElemenrt {

    public static void main(String[] args) {

        List<String> r =Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

         List<String> t =  r.stream().distinct().collect(Collectors.toList());

        System.out.println(t);

    }


}
