package Java_8_Features.Method_Reference;

public class Test2 {


        public static void m2()
        {
            System.out.println("this is m2 method");
        }

        public static void main(String[] args)
        {
            // without method reference
            //Myinterface r =()-> sout(" hello m1 method");
            Myinterface m1 = Test2::m2;
            m1.m1();
        }
    }
    interface Myinterface2
    {
        public void m1();
    }

