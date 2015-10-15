/**
 * Created by user on 10/7/15.
 */
public class stringconcatn{
        String str1;
        String str2;

     public String con() {
         String str3 = str1 + str2;
         return str3;
     }

    public static void main(String args[])
    {
        stringconcatn a = new stringconcatn();
        a.str1 = "Selenium";
        a.str2 = "Training";
        a.con();
        System.out.println("Concatination of two strings:"+""+ a.con());
    }
}
