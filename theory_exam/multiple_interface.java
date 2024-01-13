import java.util.*;
import java.lang.*;


interface interface_1
{
    abstract void func1();
    int a = 10;
}

interface interface_2
{
    abstract void func2();
    int b = 20;
}

interface interface_3 extends interface_1, interface_2
{
    abstract void func3();
    int c =30;
}

class Interface_implement implements interface_3
{
    public void func1()
    {
        System.out.println("This is a function implemented using an interface"+a);
    }
    public void func2()
    {
        System.out.println("This is a function implemented using an interface"+b);
    }
    public void func3()
    {
        System.out.println("This is a function implemented using an interface"+c);
    }
}


public class multiple_interface {
    public static void main(String args[])
    {
        Interface_implement obj1 = new Interface_implement();
        obj1.func1(); 
        obj1.func2();
        obj1.func3();
    }
}
