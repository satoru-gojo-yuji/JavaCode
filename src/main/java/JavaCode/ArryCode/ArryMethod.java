package JavaCode.ArryCode;

public class ArryMethod {


    public static void add(int arr[])
    {
        for(int i=0; i<arr.length ; i++)
            for(int j=i+1 ; j<arr.length; j++)
                if(arr[i] == arr[j])
                    System.out.println("Duplicate element " + arr[i]);
    }
    public static void main(String[] args) {
        int a[] = {5, 6, 3, 5, 8, 9};
         add(a);
    }
}
