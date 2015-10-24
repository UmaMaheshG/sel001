package Src.com.salesforce.Qa;

/**
 * Created by RAGHU on 10/24/2015.
 */
public class Superparent {

    String str1="Parent";
    String str2="Class without super";
    public void method()
    {
        String str3= str1 + str2;
        System.out.println("Display string is:" +str3);
    }
}
