class Mythread extends Thread
{
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            try
            {
                sleep(1500);
                System.out.println("Thread accessesd is "+ Thread.currentThread().getName());
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}


public class suspend 
{
    public static void main(String args[])
    {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        t1.start();
        t2.start();
        t3.start();

    }    
}
