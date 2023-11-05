package Java_8_Features;

public class Lambdaexpression {

     interface  Ap
     {

     }

    public void m1()
    {
        System.out.println("hello");
    }

    // Conver into Lambda expression
    public static void main(String args[]) {
        Runnable hello = () -> System.out.println("hello");

    }

}
