import java.util.*;
public class Vector_eg {
    public static void main(String args[])
    {
        Vector <Integer> v1= new Vector<>();
        v1.add(1);
        v1.add(2);
        System.out.print(v1.get(0));
        Iterator <Integer> i1 = v1.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next());
        }
    }
}
