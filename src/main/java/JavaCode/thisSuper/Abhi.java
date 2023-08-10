package JavaCode.thisSuper;

class Cat
{
    public void mycall()
    {
        System.out.println("calling through super method");
    }
    Cat()
    {
        System.out.println("Super class methods");
    }
}
 class CallingMethods extends Cat {


     public  CallingMethods() {
         super();
        super.mycall(); //calling the super class method
     }
 }
   public class Abhi
   {

    public static void main(String[] args) {
       CallingMethods d = new CallingMethods();

    }
}

