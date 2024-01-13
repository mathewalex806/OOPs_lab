class Function
{
    void funct()
    {
        System.out.println("No parameters inputted");
    }

    void funct(int a)
    {
        System.out.println("One variable");
    }

    void funct(int a, int b)
    {
        System.out.println("Two variables inputted");
    }
}





public class method_overloading {
    public static void main(String args[])
    {
        Function f1 = new Function();
        f1.funct();
        f1.funct(10);
        f1.funct(10,11);
    }
}
