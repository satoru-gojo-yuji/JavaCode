package JavaCode.thisSuper;


class  Current
{
    int i ;
    String e ;

    Current(int i , String e)
    {
        this.i = i;
        this.e = e;
        System.out.println(+i+" "+e);
    }
    Current()
    {
        System.out.println("");
    }




}
class  Super extends Current
{
    int t ;
     Super()
      {
        //  super(5 , "ffff");

          System.out.println("fff");
      }
      Super(int P)
      {
          super(7 , "fsdffsf");
          this.t =P ;
         // System.out.println(this.t);
      }



}
public class Main {

    public static void main(String[] args)
    {
      Super r = new Super();
        Super r1 = new Super(5);


    }
}
