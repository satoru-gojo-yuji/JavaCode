package Java_8_Features.Stream.Joinner;

import java.util.StringJoiner;

public class Demo {

    public static void main(String[] args) {

       // StringJoiner r = new StringJoiner("/");
           StringJoiner r = new StringJoiner(",","{" , "}");
        r.add("teru");
        r.add("teru");
        r.add("teru");
        r.add("teru"); r.add("teru"); r.add("teru");

        System.out.println(r);


    }
}
