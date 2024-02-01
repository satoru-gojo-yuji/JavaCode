package Java_8_Features.FunctionalIndterface.Runfnable_Interface;

public class Demo2 {

    public static void main(String args[])
    {
     Runnable r =  new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
       r.run();

    }
}
