import java.util.*;
import java.io.*;
public class Filereader {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try{
        FileWriter f = new FileWriter("test.txt");
        f.write("Hello, World");
        f.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
}      
}
