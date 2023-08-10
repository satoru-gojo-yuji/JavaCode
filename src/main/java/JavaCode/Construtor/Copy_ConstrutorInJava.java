package JavaCode.Construtor;

 class Copy_Construtor {

    // Class data members
    private double re, im;

    // Constructor 1
    // Parameterized constructor
    public Copy_Construtor(double re, double im) {

        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }

    // Constructor 2
    // Copy constructor
    Copy_Construtor(Copy_Construtor c) {

        System.out.println("Copy constructor called");
        System.out.println(c.im+" , "+c.re);

       /* re = c.re;
        im = c.im;*/
    }

    // Overriding the toString() of Object class
    @Override
    public String toString() {

        return "(" + re + " + " + im + "i)";
    }
}

// Class 2
// Copy_ConstrutorInJava class
public class Copy_ConstrutorInJava {

    // Copy_ConstrutorInJava driver method
    public static void main(String[] args)
    {

        // Creating object of above class
       Copy_Construtor c1 = new Copy_Construtor(10, 15);

        // Following involves a copy constructor call
       Copy_Construtor c2 = new Copy_Construtor(c1);

        // Note: Following doesn't involve a copy
        // constructor call
        // as non-primitive variables are just references.
      // Copy_Construtor c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);
    }
}

