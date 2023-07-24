package JavaCode.ArryCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_the_arry {

    public static void main(String[] args)
    {
        int arr[]={ 5, 6,3,5, 3,7 ,9};
         int arr1[] = new int[]{5,7,3,5,1,2};
         String rrr[] = {"rtggs","frtdff"};

        Arrays.sort(arr1);  // Arrays is the class and sort and tostring is the method

        System.out.println(Arrays.toString(arr1));

        List<int[]> s =Arrays.asList(arr);
        System.out.println(s);

        List r = Arrays.asList(rrr);
      // System.out.println(s);
        System.out.println(r);

        int arr2[] =new int[10];

        Integer ab[] =new Integer[]{4,5,6,7,2,4};
        List<Object> R =Arrays.asList(ab);

        System.out.println(R);

        System.out.println(Arrays.toString(arr2));

        // Dynamic add the value in the list aslist conver the arr into list
        ArrayList<Integer> Y = new ArrayList<Integer>(Arrays.asList(ab));

        Y.add(6);

        System.out.println(Y);






    }
}
