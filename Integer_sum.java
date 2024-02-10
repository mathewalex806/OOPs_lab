import java.io.*;
public class Integer_sum {
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("integers.txt");
            FileWriter fw = new FileWriter("int_sum.txt");
            int ch = fr.read();
            int sum=0;
            while(ch != -1)
            {
                 if (ch == 32)
                 {
                    System.out.println(" ");
                    fw.write((char)ch);
                    ch = fr.read();
                    

                 }
                 else
                 {
                    fw.write((char)ch);
                    String s = String.valueOf((char)ch);
                    sum = sum + Integer.parseInt(s);
                    System.out.println(ch-'0');
                    ch = fr.read();
                 }
            }
            fw.write("\nThe value of the sum of all integers is "+sum);
            fr.close();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
