/**
 * Created by PRANAV on 10/6/2015.
 */
public class Concat {
    String a;
    String b;
    String d;

    public String concating()
    {

        String c=a.concat(b);
        return c;
    }
    public String concating1() {

        String c = a+d+b;
        return c;
    }

    public void div()
    {
          try
          {
              int c = 2 / 0;
              System.out.println("this is not executed");
          }
        catch(ArithmeticException e)
        {
            System.out.println("The exception is  "+e);
        }

    }

    public static void main(String args[])
    {

        Concat obj1= new Concat();
        obj1.a="Selenium ";
        obj1.d="...........";
        obj1.b="Training ";
        String str="Selenium Training";
        System.out.println("The concatinated text is:-"+obj1.concating());
        System.out.println("The length of the concatinated text is:-" + str.length());
        System.out.println("The concatinated text is:-"+obj1.concating1());
       obj1.div();
    }
}
