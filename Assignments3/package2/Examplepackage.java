package package2;

import publicp.Defaultclass;

/**
 * Created by PRANAV on 10/25/2015.
 */
public class Examplepackage extends Defaultclass
{
    public static void main(String []args)
    {
        Examplepackage p=new Examplepackage();
        p.display1();//calling public method from another package
        p.display4();//calling protected method from another package
    }
}
