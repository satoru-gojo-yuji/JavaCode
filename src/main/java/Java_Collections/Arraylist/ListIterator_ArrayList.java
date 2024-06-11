package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ArrayList {
    public  static  void main(String[] args) {
        ArrayList Y = new ArrayList();
        Y.add(1);
        Y.add(7);
        Y.add(7);
        Y.add(6);
        Y.add(7);
        Y.add(8);
        ArrayList < Long > numbers1 = new ArrayList < Long > ();
        numbers1.add(88l);
        numbers1.add(67l);
        numbers1.add(57l);
        ListIterator < Long > listIterator1 = numbers1.listIterator();
     //   System.out.println(Y);

        ListIterator itr =Y.listIterator();
    // backWard direction
        while(listIterator1.hasPrevious())
        {
           System.out.println(listIterator1.previous());
        }
      //  System.out.println(Y);

        //forward direction
      /*  while (itr.hasNext())
        {
            int s =(int)itr.next();
            if(s==8)
                itr.set(9);
            else if(s==1)
                itr.add(10);
            else if(s==6)
                itr.remove();

        }
        System.out.println(Y);*/




       //***********************************************************************************//
        ArrayList < Long > numbers = new ArrayList < Long > ();
        numbers.add(88l);
        numbers.add(67l);
        numbers.add(57l);
        ListIterator < Long > listIterator = numbers.listIterator();
        System.out.println("The list of alphabets is given as : "+numbers);
        System.out.println("In the forward direction : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("In the backward direction:- ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
