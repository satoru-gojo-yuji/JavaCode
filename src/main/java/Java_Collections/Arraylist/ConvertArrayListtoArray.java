package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListtoArray {
    public static void main(String[] args) {
        //String s[] = {"t", "Y", "u",};
        //Arrays.asList is used to convert array to ArrayList
        ArrayList<String> T = new ArrayList<String>();
        T.add("H");

        String d[] = new String[T.size()];
          T.toArray(d);

          for(int i=0 ; i<d.length ; i++)
          {
              System.out.println(d[i]);
          }
    }
}
