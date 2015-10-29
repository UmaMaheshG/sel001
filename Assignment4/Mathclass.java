/**
 * Created by swathi.karri on 28-10-2015.
 */
class Mathclass implements MultiInterface
{
  int a;
    int b;

    @Override
    public int Add()
    {
        int c= a + b;
        return c;
    }

    @Override
    public int subtract()
    {
        int d= a - b;
        return d;

   }

    public int multiplication(int a, int b)
    {
        int e= a*b;
        return e;
    }
    public void div(int a, int b)
    {
        int div= a/b;
        System.out.println("Division of two numbers:" +div);
    }

public static void main(String args[])
{
    int x= 10;
    int y=11;

    Mathclass obj= new Mathclass();
    obj.a=5;
    obj.b=10;
    System.out.println("Addition of two numbers is:" +obj.Add());
    System.out.println("Subtraction of a and b is: " +    obj.subtract());
    int out= obj.multiplication(x,y);
    System.out.println("Multiplication of two number:" +out);
    obj.div(10,2);

}
}

