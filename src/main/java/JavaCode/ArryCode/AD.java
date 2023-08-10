package JavaCode.ArryCode;

  abstract class AD {

     public  AD() {
         System.out.println(AD.class);
     }
 }
 class ED extends AD
 {
    /* public ED()
     {
         System.out.println(ED.class);
     }*/

 }
 class Test
 {
     public static void main(String[] args)
     {
         ED e = new ED();
     }
 }




