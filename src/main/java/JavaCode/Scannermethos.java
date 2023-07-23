package JavaCode;


import java.util.Scanner;

class Scannermethos {

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter name, age and salary:");
            int r =5;
       String s =Integer.toString(r);
            // String input
            String name = myObj.nextLine();

            // Numerical input
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();

            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            String t ="4565";
            float u = Float.parseFloat(t);







        }
    }
