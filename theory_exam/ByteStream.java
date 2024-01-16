import java.io.*;
import java.util.*;
import java.lang.*;
public class ByteStream {
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fi = new FileInputStream("test.txt");
            int size = fi.available();
            for (int i=0; i<size; i++)
            {
                char ch = (char)fi.read();
                System.out.println(ch);
            }
            fi.close();
            FileOutputStream f2= new FileOutputStream("test.txt");
            String s = "Output operation";
            for (int i=0; i<s.length(); i++)
            {
                byte[] b ={65,66,67};
                f2.write(b);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
