package Java_8_Features.FunctionalIndterface.Runfnable_Interface;

public class Demo implements Runnable {


    @Override
    public void run() {
        for(int i=0; i<=10 ; i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Demo d =new Demo();
        Thread t = new Thread(d);
        t.start();
    }
}
