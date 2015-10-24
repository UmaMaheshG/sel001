package Src.com.salesforce.Qa;

/**
 * Created by RAGHU on 10/24/2015.
 */
public class Superchaild extends Superparent {

    String str1= "Child";

    public void method()
    {
        String str4= super.str1 + str1;
        System.out.println("Display Subclass metod string:" +str4);
        super.method();
    }
    public static void main(String args[])
    {
      Superchaild obj1= new Superchaild();
        obj1.method();
    }
}
