package Java_Collections.Arraylist;

import CodingQ.S;
/*import Java_8_Features.Stream.StreamAPImethods.Collectors;

import java.util.*;

public class Remove_duplicatesElements_ArrayList {
    public  static  void main(String[] args)
    {
        ArrayList<Object> t = new ArrayList<>();
        t.add(4);
        t.add(4);
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(4);
        t.add(4);

        Set<Object> r =new LinkedHashSet<Object>(t);

        ArrayList<Object> tt = new ArrayList<Object>(r);
        System.out.println(tt);

        List<Object> y =t.stream().distinct().collect(Collectors.toList());

        List<Object> y1 =t.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(y);*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("banana");

        // Use streams to remove duplicates
        List<String> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}


