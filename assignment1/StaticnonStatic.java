/**
 * Created by PRANAV on 10/13/2015.
 */

//example for static nonstatic methods

public class StaticnonStatic {

    public void nonstaticmethod()
    {

        System.out.println("message from nonstatic method" );
    }

    public static void staticmethod()
    {

        System.out.println("message from static method ");
    }

public static void main(String []args)
{

    StaticnonStatic stn=new StaticnonStatic();
    stn.nonstaticmethod();
    staticmethod();
    Static1 st=new Static1();//different class object canbe created in this class
    st.add(1,2);    //a non static method should be called using object
    //Static1.add(2,3);This is incorrect as it is a nonstatic method it needs object
    Static1.mul(2,3); //a static method can be called using class name


}

}
