package Java_8_Features.Method_Reference;

public class Test {


    public static void main(String[] args) {




        //Myinterface r = () -> System.out.println("call to m2 method");

        // for this we can use through method reference
        Myinterface r1 = Demo::m2;

        r1.m1();
    }
}