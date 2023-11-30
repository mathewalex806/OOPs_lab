import java.util.*;
import java.io.*;
public class Reading_file {
    public static void main (String args[])
    {
        try
        {
            File obj1 = new File("test1.txt");
            Scanner Reader = new Scanner(obj1);
            while (Reader.hasNextLine())
            {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
        

    }
}
