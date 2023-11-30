import java.io.*;

class File_creation
{
    public static void main (String args[])
    {
        try
        {
            FileInputStream f = new FileInputStream("test1.txt");
            int c = f.read();
            while(c!=0)
            {
                System.out.println((char)c);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
