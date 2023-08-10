package JavaCode.Construtor;

class CConstrutor
{
   private int r;
   private int r1;

   CConstrutor(int r, int t)
   {
       this.r=r;
       this.r1=t;
       System.out.println(r+" "+t);
   }
   CConstrutor(CConstrutor  f)
   {
      // System.out.println(f.r+" "+f.r1);
       System.out.println(f);
   }

    @Override
    public String toString() {
        return  "("+r+ " "+r1+")";
    }
}


public class Copycon {

    public static void main(String[] args)
    {
        CConstrutor y =new CConstrutor(5,7);
        CConstrutor u = new CConstrutor(y);
    }
}
