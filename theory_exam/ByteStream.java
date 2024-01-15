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
                int val = (int)s[i];
                f2.write(val);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
