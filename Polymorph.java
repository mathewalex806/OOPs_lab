import java.util.*;
import java.lang.String;

class Polymorph
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Hexagon h1 = new Hexagon();

        System.out.println(r1.numberOfSides());
        System.out.println(t1.numberOfSides());
        System.out.println(h1.numberOfSides());
    }
}

abstract class Shape
{
    abstract String numberOfSides();
}

class Rectangle extends Shape
{
    String numberOfSides() {
        return"A rectangle has 4 sides";
    }
}

class Triangle extends Shape
{
    String numberOfSides()
    {
        return"A triangle has 3 sides";
    }
}

class Hexagon extends Shape
{
    String numberOfSides()
    {
        return "A hexagon has 6 sides";
    }
}

