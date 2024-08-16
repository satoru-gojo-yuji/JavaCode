package CodingQ;

public class LastZero {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 0, 9, 0, 5, 0, 6, 0};
        int C = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[C++] = arr[i++];
            }
        }
    }
}
git