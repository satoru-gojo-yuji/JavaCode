package JavaCode.String;

public class Revers_string {
    public static void main(String[] args)
    {
        String t = "Abhishek Pal";

        char ch =t.charAt(4);
        //  System.out.println(ch);

        char chr[] =t.toCharArray();

        for(int i =chr.length-1; i>=0;  i--)
        {
            System.out.print(chr[i]);
        }
    }
}
