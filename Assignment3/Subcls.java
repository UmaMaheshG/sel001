package Src.com.salesforce.Qa;

/**
 * Created by RAGHU on 10/24/2015.
 */
public class Subcls extends Supercls {
    Supercls obj1= new Supercls();
    public void add1(int a, int b, int c)
    {
        obj1.add(a,b);
        int d= a+b+c;
        System.out.println("Multiplaction of 3 nubers:" +d);
        System.out.println("Sting is:" + str);
    }
    public static void main(String args[])
    {
        Subcls obj2 = new Subcls();
        //obj2. add(3,2);
        obj2.add1(10,20,30);

    }
}
