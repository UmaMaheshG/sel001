import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by swathi.karri on 28-10-2015.
 */
public class FileWrite {
    public static void main(String args[])
    {
        File newfile= new File("Config.properties");
        FileOutputStream fout= null;
        try
        {
            fout = new FileOutputStream(newfile);
            String s= "Inserting one line into file";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Inserted successfully");
        }
     catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
     }
        catch( IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
