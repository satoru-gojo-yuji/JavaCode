package Lambda_Expresison;
interface StringConcat {
    String concat(String a, String b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Implement the custom functional interface using a lambda expression
        StringConcat concat = (a, b) -> a+ " " +b;
        String result = concat.concat("Hello", "World");
        System.out.println(result);
    }
}

