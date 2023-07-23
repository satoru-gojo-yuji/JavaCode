package JavaCode;

public class ConvertString {

    public static void main(String[] args)
    {
        String r="67";
        int t =Integer.parseInt(r) ;  //  if you want to change the string to primitive type then use parse method

        int T = 65;
        String f =String.valueOf(T);

        String g =Integer.toString(T);
        String g1 = String.format("%d",T);

        int y =34;
        float g2 =Float.valueOf(y);
        //float g3 =Float.parseFloat


    }
}
