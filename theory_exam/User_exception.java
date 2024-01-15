import java.io.*;

class MyException extends Exception
{
    public MyException(String mssg)
    {
        super(mssg);
    }
}



public class User_exception 
{
    public static void main(String args[])
    {
        try 
        {
            int a = 10;
            if (a==10)
            {
                throw new MyException("Invalid Input");
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }    
}
