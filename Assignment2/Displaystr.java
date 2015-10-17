/**
 * Created by RAGHU on 10/15/2015.
 */
public class Displaystr {
    String str= "Qshelllabstraining";
   public void strlen()
   {

       System.out.println("Lenght of string is: " + str.length());
       for(int i=1; i<str.length();i++)
       {
           System.out.println( str.charAt(i));
        }

   }

    public static void main(String args[])
    {
      Displaystr dsr= new Displaystr();
        dsr.strlen();
        //System.out.println("Lenght of string" + str.length());

    }
}
