package Java_8_Features.FunctionalIndterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {

    public static void  main(String args[])
    {

        String[] names = {"Kajal", "Abhisek", "Nantara", "Tanishka"};

        Predicate<String> tr = (name) -> name.startsWith("A");

        for(String namew : names)
        {
            if(tr.test(namew))
            {
                System.out.println(namew);
            }
        }
    }
}
