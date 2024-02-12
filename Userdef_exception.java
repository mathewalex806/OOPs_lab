class MyException extends RuntimeException
{
    MyException(String s)
    {
        super(s);
    }
}

public class Userdef_exception 
{
    public static void main(String args[])
    {
        try{
            throw new MyException("This is a custom exception");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}
