package Java_8_Features.FunctionalIndterface.ComparableINterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Demo1 {

    public static void main(String args[]) {
        ArrayList<Integer> r = new ArrayList();
        r.add(23);
        r.add(15);
        r.add(78);
        r.add(89);
        r.add(90);

       /* Collections.sort(r, new Rem());
        System.out.println(r);*/

        Collections.sort(r ,(o1,o2)-> o1-o2);  // Asending order
        for(Object t : r)
            System.out.println(t);
       // Positive me swipe krenge
        Collections.sort(r , (o1 , o2 )-> o2-o1);
        for(Object t1 : r)
            System.out.println(t1);



    }
}
  /* class Rem implements Comparator<Integer>
   {

       @Override
       public int compare(Integer o1, Integer o2) {
          if(o1 < o2)   // descending order
           return -1;
          else if (o1 > o2)
              return 1 ;
          else
              return 0 ;*/

        /*  Collections.sort(r ,(o1,o2)-> o1 > o2);
       }
   }*/
