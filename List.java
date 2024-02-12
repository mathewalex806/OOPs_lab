import java.util.*;
public class List {
    public static void main(String args[])
    {
        ArrayList <Integer> ls = new ArrayList <Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);

        Iterator<Integer> itr = ls.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next())    ;
        }

        Stack <Integer> s1 = new Stack<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Iterator<Integer> itr1 = s1.iterator();

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }



    }

    
}
