package Java_8_Features.FunctionalIndterface.Bipredicate;

import java.util.function.Supplier;

public class Demo2 {

    public static void main(String[] args)
    {
        Supplier<String> r =() -> {
            String otp =" ";
            for(int i=1 ; i<=6 ; i++)
            {
                otp = otp +(int) (Math.random()*10);
            }
            return  otp;
        };
        System.out.println(r.get());
    }
}
