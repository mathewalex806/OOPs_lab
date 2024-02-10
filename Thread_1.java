class MyRunnable implements  Runnable
{
    public void run()
    {
        call_print();
    }

    void call_print()
    {
        print();
    }
    synchronized void print()
    {
        for(int i=0; i<25; i++)
        {
            System.out.println(Thread.currentThread().getName()); 
        }
        
    }
}

public class Thread_1 {
    public static void main(String args[])
    {
        MyRunnable rt = new MyRunnable();
        Thread t1 = new Thread(rt);
        Thread t2 = new Thread(rt);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
