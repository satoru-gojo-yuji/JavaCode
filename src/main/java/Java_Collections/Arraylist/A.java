package Java_Collections.Arraylist;

import java.util.*;
//import java.util.Arrays;

public class A {
    public static void main(String[] args) {

        int t =8;

        String[] arr =new String[] {"Abhis" , "Nhai" , " titi ogg ", " fdfff"} ;

       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(" ", "");
        }*/
        ArrayList<String> f =new ArrayList<>(Arrays.asList(arr));

      for(int i =0 ; i<f.size() ; i++)
      {
          f.set(i , f.get(i).replaceAll("\\s", ""));
      }
        System.out.println(f.size());

        for(String s: f)
            System.out.println(s);


    }
}
