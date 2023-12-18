import java.util.*;

class Box
{
    public String toString()
    {
        return "This is the box class";
    }
}
public class string {
    public static void main(String args[])
{
    char ch[] = {'a'};
    String letter = new String(ch);
    System.out.println(letter);
    Box b1 = new Box();
    System.out.println(b1);
    String s1 ="Alex";
    String s2 = new String(s1);
    System.out.println(s1==s2);
    System.out.println(s1.indexOf('c'));

}
}

