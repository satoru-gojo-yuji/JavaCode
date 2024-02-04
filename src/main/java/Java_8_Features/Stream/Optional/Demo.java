package Java_8_Features.Stream.Optional;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {


        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);

       // Optional<String> value1 = Optional.ofNullable();

        System.out.println(value.get());
      //  System.out.println(value1.get());

    }
}
