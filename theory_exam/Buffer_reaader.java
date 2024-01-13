import java.util.*;
import java.io.*;
public class Buffer_reaader {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line\n");
        String s1 = br.readLine();
        System.out.println(s1);
    }   
}
