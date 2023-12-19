import java.util.*;
class Samplethread implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class thread_interface {
    public static void main(String[] args) {
        Samplethread obj = new Samplethread();
    Thread t1 = new Thread(obj);
    t1.run();
    }
    
}
