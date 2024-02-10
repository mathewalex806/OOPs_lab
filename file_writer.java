import java.io.*;
public class file_writer {
    public static void main(String args[])
    {
        try
        {
            FileWriter fw = new FileWriter("foo.txt");
            fw.write("foo bar baz");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
