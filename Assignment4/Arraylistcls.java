/**
 * Created by swathi.karri on 27-10-2015.
 */
import java.util.*;
public class Arraylistcls {

    public static void main(String args[])
    {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Swathi");
        ar.add("priya");
        ar.add("Kiran");

        for(String obj:ar)
        {
            System.out.println(obj);
        }
    }
}
