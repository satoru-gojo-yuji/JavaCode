package Java_Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverArryatoArraylist {

    public static void main(String[] args)
    {
        String s[] = {"t","Y","u",};
       //Arrays.asList is used to convert array to ArrayList
        ArrayList<String> T = new ArrayList<String>(Arrays.asList(s));
        T.add("H");

        System.out.println(T);
    }
}
