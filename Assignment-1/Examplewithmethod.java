/**
 * Created by dell on 10/4/2015.
 */
public class Examplewithmethod {

    int a;
    int b;

    public int addition()
    {
        int sum = a+b;
        return sum;
    }
    public int multiplication()
    {
        int mul = a*b;
        return mul;
    }
    public int sub()
    {

        int sub=a-b;
        return sub;
    }

    public float division()
    {
        float div=a/b;
        return div;
    }

    public static void main(String args[]){

        Examplewithmethod x1= new Examplewithmethod();
        x1.a=10;
        x1.b=20;
       System.out.println("Addition is     " + x1.addition());
        Examplewithmethod x2= new Examplewithmethod();
        x2.a=200;
        x2.b=30;
        x2.sub();
        System.out.println("substraction is   "+x2.sub());
        System.out.println("multiplication is   "+x2.multiplication());
        x2.division();
        System.out.println("division is   "+x2.division() );

    }
}
