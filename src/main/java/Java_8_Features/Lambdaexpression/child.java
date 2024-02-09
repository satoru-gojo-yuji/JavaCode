package Java_8_Features.Lambdaexpression;

    interface  Ap
     {
        public void m1();
     }
public class child {
    public static void main(String[] args) {
        Ap t =()-> System.out.println("hello");
        t.m1();
    }
}


    /* public void m1()
    {
        System.out.println("hello");
    }

    // Conver into Lambda expression
    public static void main(String args[]) {
        Runnable hello = () -> System.out.println("hello");*/




