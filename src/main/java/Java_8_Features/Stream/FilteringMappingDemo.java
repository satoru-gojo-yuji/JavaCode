package Java_8_Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilteringMappingDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Anushka");
        list.add("Trisha");
        list.add("Nayanatara");
        list.add("Deepika Padukone");
        list.add("Pooja Hegde");
        list.add("Anupama Parameswaran");
        list.add("Amisha Patel");

        Stream<String> stream = list.stream();

        //print heroine name with length whose name is starting with A
      /*  stream.filter(name -> name.startsWith("A"))
                .map(name -> name +"::"+name.length())
                .forEach(System.out::println);*/

        /* IntStream t =stream.mapToInt(name-> name.length() );  for Integer value
        t.forEach(System.out::println);*/
       stream.filter(name -> name.startsWith("A"))
               .map(name -> name + "::" + name.length())
               .forEach(System.out::println);


}
}