import java.lang.*;
import java.util.*;

class Test
{
    int x;
}
public class Garbage {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Runtime r = Runtime.getRuntime();
        long mem1, mem2, mem3;
        mem1 = r.freeMemory();
        System.out.println("free memory"+mem1);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i=0; i<n; i++)
        {
            Test t1 = new Test();
            Test t2 = new Test();
        }
        mem2 = r.freeMemory();
        System.err.println("After array creation" +mem2);
        r.gc();
        mem3 = r.freeMemory();
        System.out.println("Memory after clearing "+mem3);

    }
}
