import java.util.*; 
import java.io.*;
public class File_copying {
    public static void main(String args[])
    {
        try 
        {
            FileInputStream f1 = new FileInputStream("test1.txt");
            FileOutputStream f2 = new FileOutputStream("test2.txt");
            int r;
            do
            {
                r = f1.read();
                System.out.println(r);
                f2.write((char)r);
            }
            while(r != -1);
            System.out.println("File copied");
            f1.close();
            f2.close();
        } 
        catch (Exception e) 
        {
            System.out.println("File not found");
        }
    }
}
