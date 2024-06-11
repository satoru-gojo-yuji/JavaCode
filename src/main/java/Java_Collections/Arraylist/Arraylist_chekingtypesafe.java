package Java_Collections.Arraylist;

import java.util.ArrayList;

public class Arraylist_chekingtypesafe {

    public static void main(String[] args)
    {

          String name[] = new String[300];
           name[0] = "reeff";
         //  name[4] = new Integer(50);
        ArrayList<String>  f = new ArrayList<>();
      //  f.add(new Integer(10));


        String[] a = {"5", "6", "6"};

        for(String s : a)
        System.out.println(s);
    }

}
