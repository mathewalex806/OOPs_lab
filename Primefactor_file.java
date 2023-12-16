import java.util.*;
import java.io.*;
public class Primefactor_file {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try
        {
            FileWriter f1 = new FileWriter("factor.txt");
            int temp = num;
            for (int i=2; i<(temp/2); i++)
            {
                if (temp % i == 0)
                {
                    f1.write(i+" ");
                }
            }
            f1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
