package CodingQ;


/*
String occurence charechter
*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Stringcode {

    public static void main(String[] args) {


        Scanner s =new Scanner(System.in);
        String userName = s.nextLine();

        HashMap<Character, Integer>  map = new HashMap<Character, Integer>();

          char[] cha = userName.toCharArray();

          for(char c : cha) {
              if (map.containsKey(c))
                  map.put(c, map.get(c) + 1);
              else
                  map.put(c, 1);

          }
          for(Map.Entry<Character, Integer> entry : map.entrySet())
          {

              if (entry.getValue() > 1) {
                  System.out.println(entry.getKey()
                          + " : "
                          + entry.getValue());
          }
    }
}
    }
