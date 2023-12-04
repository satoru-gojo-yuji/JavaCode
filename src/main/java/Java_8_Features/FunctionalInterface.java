package Java_8_Features;

public interface FunctionalInterface {

   //public void m1();

    public void m2(int a, int b);
     default void m1(String s)
    {
        System.out.println("Hello");
    }
}
   class Main {
       public static void main(String args[])
       {
        //   FunctionalInterface t =()-> System.out.println("Hello");

          FunctionalInterface t1 =(a,b)-> System.out.println(+a+" "+b);
         //  t.m1();
           t1.m2(4,5);
           t1.m1("char");
       }


   }


