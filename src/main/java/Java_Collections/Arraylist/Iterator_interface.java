package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_interface {

    public  static  void main(String[] args)

    {
        ArrayList Y = new ArrayList();
        Y.add(7);
        Y.add(7);
        Y.add(7);
        Y.add(7);
        Y.add(7);
        Y.add(8);
       // Y.add("");


        Iterator itr =Y.iterator();
        while(itr.hasNext())
        {

            int t = (int) itr.next();
           // System.out.println(t);
            if(t==8)
                itr.remove();
            System.out.println(t);
        }
        System.out.println(Y);
    }
}
