package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicatesElements_ArrayList {
    public  static  void main(String[] args)
    {
        ArrayList<Object> t = new ArrayList<Object>();
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




    }
}
