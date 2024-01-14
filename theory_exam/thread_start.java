class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Thread "+Thread.currentThread().getName()+"  has been activated");
    }
}

class Interface implements Runnable
{
    public void run()
    {
        System.out.println("Thread "+ Thread.currentThread().getName()+" is running");
    }
}

public class thread_start 
{
    public static void main(String args[])
    {
        System.out.println("Main method");
        /*
        Mythread obj1 = new Mythread();
        obj1.start();
        Mythread obj2 =  new Mythread();
        obj2.run();
         */
        Interface obj1 = new Interface();
        Thread thr = new Thread(obj1);
        thr.start();

    }
}
