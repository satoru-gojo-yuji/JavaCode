package JavaCode.ArryCode;

public class TwoDimestionArry {

    public static void main(String[] args) {
        int[][] d = {{4, 5}, {6, 5}, {5, 9}};


        //  int [][] R = new int[l][l];
       /* int[][] arr = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);*/

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(+d[i][j]);
            }
        }
    }
}

