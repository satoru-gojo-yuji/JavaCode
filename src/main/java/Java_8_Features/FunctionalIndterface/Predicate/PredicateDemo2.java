package Java_8_Features.FunctionalIndterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void  main(String args[])
    {

        String[] names = {"Kajal", "Abhisek", "Nantara", "Aanishka"};

        Predicate<String> tr = (n) -> n.startsWith("A");

        for(String namew : names)
        {
            if(tr.test(namew))
            {
                System.out.println(namew);
            }
        }
    }
}
