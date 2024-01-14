class Constructor_overloading
{
    int a, b, c;
    Constructor_overloading()
    {
        a = 10;
        b=10;
        c=10;
    }
    Constructor_overloading(int a, int b, int c)
    {
        System.out.println("Accessing the constructor with the variable input");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        Constructor_overloading obj1 = new Constructor_overloading();
        Constructor_overloading obj2 = new Constructor_overloading(10, 11,12);
        System.out.println(obj2.a+""+obj2.b);
    }
}
