package JavaCode.ArryCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_the_list_into_arry {

    public static void main(String[] args)
    {
        ArrayList<Integer> T =new ArrayList<Integer>();
        ArrayList<Integer> ArrLis
                = new ArrayList<Integer>();

        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);

        Integer r[] =new Integer[ArrLis.size()];
          r =ArrLis.toArray(r);

        System.out.println(Arrays.toString(r));


    }
}
