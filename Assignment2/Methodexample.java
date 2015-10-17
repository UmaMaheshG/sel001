/**
 * Created by RAGHU on 10/16/2015.
 */
public class Methodexample
{
    public void dnymethod()
    {
        System.out.println("This is Dynamic Method");
    }
    public static void staticmethod()
    {
        System.out.println("This is static method");
    };
    public static void main(String args[])
    {
       Methodexample md1= new Methodexample();
        //Dynamic method declaration
        md1.dnymethod();
        //Static method declaration
        Methodexample.staticmethod();
    }
}
