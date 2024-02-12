interface Factors
{
    int factorsum(int n);
}

class Arthmetic implements Factors
{
    public int factorsum(int n)
    {
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            if (n%i==0)
            sum = sum+i;
        }

        return sum;
    }
}
public class Interface_1 {
    public static void main(String args[])
    {
        Arthmetic ar = new Arthmetic();
        System.err.println(ar.factorsum(6));
    }
}
