package Java_8_Features.FunctionalIndterface.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {


    public static void main(String[] args)
    {
        Supplier<Date> dt = () -> new Date();
        System.out.println(dt.get());

    }
}
