package Src1.com.salesforce.Utilities;

/**
 * Created by RAGHU on 10/24/2015.
 */
public class Exptioncls {

    public void div(int a,int b )
    {
        try
        {
            int c = a / b;
            //return c;
            System.out.println("Division of two numbers" +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("continue....");
    }

    public static void main(String args[])
    {
        Exptioncls obj1= new Exptioncls();
        obj1.div(5,0);
        //int div1= obj1.div(5,0);
        //System.out.println("Division of two numbers:" +div1);
    }
}
