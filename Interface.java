import java.util.*;

interface Flyable
{
    abstract String flyobj();
}

class Spacecraft implements Flyable
{
    public String flyobj()
    {
        return "A Spacecraft can fly";
    }
}

class Airplane implements Flyable
{
    public String flyobj()
    {
        return "An Airplane can fly";
    }
}

class Helicopter implements Flyable
{
    public String flyobj()
    {
        return "A Helicopter can fly ";
    }
}

class Interface
{
    public static void main(String args[])
    {
        Spacecraft s1 = new Spacecraft();
        Airplane a1 = new Airplane();
        Helicopter h1 = new Helicopter();
        System.out.println(s1.flyobj());
        System.out.println(a1.flyobj());
        System.out.println(h1.flyobj());
    }
}