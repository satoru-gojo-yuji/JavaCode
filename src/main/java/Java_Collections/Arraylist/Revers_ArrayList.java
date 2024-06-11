package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Revers_ArrayList {

    public  static  void main(String[] args)
    {
        ArrayList<Object> t = new ArrayList<Object>();
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(7);

        Collections.reverse(t);
        Collections.reverse(t);
        System.out.println(t);
    }
}
