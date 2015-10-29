import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by swathi.karri on 28-10-2015.
 */
public class FileReadClass
{
public static void main(String args[])
{
    File newfilerd= new File("Config.properties");
    FileInputStream fin= null;
    try {
        fin= new FileInputStream(newfilerd);
        int i=0;
        while((i=fin.read())!= -1)
        {
            System.out.println((char)i);
        }
        fin.close();
    }
    catch(FileNotFoundException e)
    {
        System.out.println(e.getMessage());
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());

    }
}

}
