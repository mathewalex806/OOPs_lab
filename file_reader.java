import java.io.*;
public class file_reader {
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("foo.txt");
             int ch =fr.read();
            while(ch != -1)
            {
                System.out.println((char)ch);
                ch  = fr.read();
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }   
    
}
