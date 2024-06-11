package Java_8_Features.FunctionalIndterface.Runfnable_Interface;

public class Demo3 {
    public static void main(String args[])
    {
        Runnable r =()-> System.out.println("hello");
        r.run();
    }
}
