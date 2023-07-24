package JavaCode.ArryCode;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Arry {

    public static void main(String[] args)
    {
        int a[] =new int[10];
            a[0]=10;
            a[1]=20;


        String s[] ={"AB", "SC", "DF", "DFS"};
           int r = s.length;
        System.out.println(r);
        for(int i=0 ; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println("Second line ");
        // for each loop
        for(String d : s)
        {
            System.out.println(d +" ");
        }
        for(int r1 : a)
        {
            System.out.println(r1);
        }


        // Multi dimensional arry

        int arr[][] =new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        int r3[][] ={{5,4},{6,5}};
        for(int i=0; i<arr.length; i++)
            for(int j=0 ; j<arr.length; j++)
            {
                System.out.println(arr[i][j]);
            }






    }
}
