package Lambda_Expresison;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Charlie", "David", "Eve");

        // Using a lambda expression with forEach

        names.forEach((name) -> System.out.println(name));

    }
}
