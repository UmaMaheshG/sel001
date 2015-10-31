/**
 * Created by PRANAV on 10/27/2015.
 */
public class Classimplement1 implements Interfaceexample,Interfaceexample2
{   public void mul(int a,int b)
       {

    int sum=a*b;
    System.out.println("The multiplication of two numbers is   "+sum);
        }


    public void add(int a,int b)
    {

        int sum=a+b;
        System.out.println("The sum of two numbers is   "+sum);
    }
    public void add(int a,int b,int c)
    {

        int sum=a+b+c;
        System.out.println("The sum of three numbers is   "+sum);
    }
    public void sub(int a,int b)
    {
        int sum=a-b;
        System.out.println("The sub of two numbers is   "+sum);

    }
    public static void main(String[] args)
    {
        Classimplement1 c=new Classimplement1();
        c.add(2,3);
        c.add(2,3,4);
        c.sub(5,2);
    }
}
