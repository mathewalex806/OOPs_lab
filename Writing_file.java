import java.io.*;
import java.util.Scanner;
public class Writing_file {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        int num = (int)ch;
        try
        {
            FileOutputStream f1 = new FileOutputStream("write.txt");
            f1.write(num);
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
