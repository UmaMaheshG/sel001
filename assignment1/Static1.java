/**
 * Created by PRANAV on 10/13/2015.
 */
//Example for sttaic non staticmethods
public class Static1 {

    public int add(int a,int b)
    {

        int c=a+b;
        System.out.println("addition from nonstatic method is" + c);
        return c;
    }

    public static int mul(int a,int b)
    {

        int c=a*b;
        System.out.println("multiplication from static method is" + c);
        return c;
    }



}
