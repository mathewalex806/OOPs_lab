class MyBox
{
    int a;
    MyBox()
    {
        System.out.println("Constructor of MYBOX has been called");
    }
}

class Box extends MyBox
{
    int b;
    Box()
    {
        System.out.println("Constructor of Box has been called");
    }
}


public class Constructor_priority {
    public static void main(String[] args) {
        Box b1 = new Box();
    }
}
