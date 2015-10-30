/**
 * Created by PRANAV on 10/30/2015.
 */
public class Inherit3 extends Inherit2
{
    public void display3()
    {

        System.out.println("This methos is from third class");
    }

    public static void main(String[] args)
    {
        Inherit3 obj1=new Inherit3();
        obj1.display3();
        obj1.display2();
        obj1.display1();

    }
}

