package CodingQ;

import java.util.Scanner;

public class Char {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int t  = S.nextInt();  //5


        char[]  f  = new char[t];

        for(int i=0 ; i<t ; i++)
        {
            f[i] = S.next().charAt(0);  // Single char it is using
        }
        System.out.println(f);

       int anser = 0 ;
               int consonent = 0;
        for(char g : f)
        {
           char c = g ;
           if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
           {
               anser++;
           }
           else {
               consonent++;
           }
        }

        System.out.println(consonent);
    }
}
