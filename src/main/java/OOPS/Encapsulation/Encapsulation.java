package OOPS.Encapsulation;

// Java Program to implement
// Custom wrapper class
import java.io.*;

// wrapper class
class Maximum {
    private int maxi = 0;// 12 ,3 ,23
    private int size = 0;  //1 ,2 ,  3

    public void insert(int x)
    {
        this.size++;
        if (x <= this.maxi)
            return ;
        this.maxi = x;
    }

    public int top() { return this.maxi; }

    public int elementNumber() { return this.size; }
};

//
class Encapsulation{
    public static void main(String[] args)
    {
        Maximum x = new Maximum();
        x.insert(12);
        x.insert(3);
        x.insert(23);

        System.out.println("Maximum element: " + x.top());
        System.out.println("Number of elements inserted: "
                + x.elementNumber());
    }
}

