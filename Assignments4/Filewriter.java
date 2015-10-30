import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
/**
 * Created by PRANAV on 10/30/2015.
 */
public class Filewriter
{
    public static void main(String[] args)
    {

        FileOutputStream fos=null;
        try
        {
            File f=new File("config4.properties");
            fos=new FileOutputStream(f);
            fos.write('s');
        }

        catch(Exception e)
        {
            System.out.println("message is"+ e);
        }
    }
}
