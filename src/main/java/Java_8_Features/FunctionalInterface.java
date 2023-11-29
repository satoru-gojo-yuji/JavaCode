package Java_8_Features;

public interface FunctionalInterface {

    public void m1();

}
   class Main {
       public static void main(String args[])
       {
           FunctionalInterface t =()-> System.out.println("Hello");
           t.m1();
       }


   }


