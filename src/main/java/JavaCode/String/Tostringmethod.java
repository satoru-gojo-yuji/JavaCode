package JavaCode.String;




  class  Ap
 {
     String r1 ;

     Ap(String r) {
         this.r1 = r;
     }
     @Override
     public String toString()
     {
         return r1;
     }
 }

public class Tostringmethod {

    public static void main(String[] args)
    {
       /* String f ="Abhishek Pal";
        System.out.println(f);*/

        Ap t =new Ap("abhishek");
        System.out.println(t);



    }
}
