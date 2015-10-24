package Src1.com.salesforce.Utilities;

/**
 * Created by RAGHU on 10/24/2015.
 */
public class Publiccls {

    public void display1()
    {
        System.out.println("Public class");
    }

    public static void main(String args[])
    {
        Publiccls obj1 =new Publiccls();
        obj1.display1();
       Privatecls obj2 =new Privatecls();
        obj2.display2();
    }
}
