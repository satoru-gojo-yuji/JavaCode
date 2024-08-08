package CodingQ;

public class Strin {

    public static void main(String[] args) {

        String  s ="sfdidjdjfaaaaaaaaa";
        int count = 0 ;
        for(int i=0 ; i<s.length(); i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) =='b')
            {
                count++;
            }
          //  System.out.println(count);
        }
        System.out.println(count);
    }
}
