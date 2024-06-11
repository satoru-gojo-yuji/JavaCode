package CodingQ;

public class Att {

    public static void main(String[] args) {
        int[] arr={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
  int n =arr.length;
        int c =0;
        for(int i=0 ; i<n ; i++) {
            if (arr[i] != 0)
                arr[c++] = arr[i];
        }
            while (c < n)
            {
                arr[c++] = 0;
        }
        for(int i=0 ; i<n ; i++)
            System.out.println(arr[i]);
    }
}
