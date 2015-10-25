/**
 * Created by user on 10/7/15.
 */
public class stringlen {
    String str1 = "Selenium";
    String str2 = "Training";

    public void len(){
        String str3 = str1+str2;
        System.out.println("Length of the string:"+str3.length());
    }

    public static void main (String args[])
    {
        stringlen a = new stringlen();
        a.len();

    }
}
