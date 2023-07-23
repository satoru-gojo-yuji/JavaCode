package OOPS.Abstraction;

public abstract class Abstraction {

     abstract void M1();

    final  int r = 0;
     Abstraction()
     {
          System.out.println("Ab");
     }

}
class A extends Abstraction
{
     A()
     {
          super();
     }
     void M1()
     {
          System.out.println("Abhishek");
     }

}
class Test
{
     public static void main(String[] args)
     {
          A r = new A();
          r.M1();
     }

}
