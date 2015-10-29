import java.io.*;
import java.util.Properties;

/**
 * Created by swathi.karri on 28-10-2015.
 */
public class FileInputStreamClass {

    public static void main(String args[])
    {
        File configfile= new File("Config.properties");

        try {

           FileInputStream fread= new FileInputStream(configfile);
            Properties pr= new Properties();
            pr.load(fread);
            String str= pr.getProperty( "Host");
            System.out.println("Host name is: " + str);
            fread.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {

        System.out.println(e.getMessage());
    }
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
    }

}
