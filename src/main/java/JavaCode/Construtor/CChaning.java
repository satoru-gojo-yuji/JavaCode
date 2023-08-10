package JavaCode.Construtor;


class Naruto
{
    int epm ;
    String tre ;

    Naruto(int r , String t)
    {


    }
    Naruto(Naruto N)
    {

        System.out.println(N.epm+" "+N.tre);
    }
}
public class CChaning {

    public static void main(String[] args)
    {
      Naruto R =new Naruto(5,"Abhi") ;
      Naruto T =new Naruto(R);
    }
}
