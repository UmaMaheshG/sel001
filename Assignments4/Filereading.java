import java.io.File;
import java.io.FileInputStream;
import java.util.*;
/**
 * Created by PRANAV on 10/30/2015.
 */
public class Filereading
{
    public static void main(String[] args)
    {
        FileInputStream fis=null;
        try
        {
            File f=new File("config.properties");
            fis=new FileInputStream(f);
            Properties p=new Properties();
            p.load(fis);
            System.out.println(p.get("name"));
        }
        catch(Exception e)
        {
            System.out.println("message is"+ e);
        }
    }
}
