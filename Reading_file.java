import java.util.*;
import java.io.*;
public class Reading_file {
    public static void main (String args[])
    {
        int ch ;
        try
        {
            FileReader obj1 = new FileReader("factor.txt");
            do
            {
                 ch = obj1.read();
               System.out.println((char)ch);
            }
            while(ch != -1);
            obj1.close();
        }
        catch(Exception e)
        {
            System.out.println("File not found");
        }
        

    }
}
