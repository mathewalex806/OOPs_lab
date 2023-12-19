import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
class Employee
{
    String name;
    int age;
    double sal;
}
public class objectser {
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.age = 50;
        e1.name = "Alex";
        e1.sal = 50000;
        try {
            FileOutputStream fout = new FileOutputStream("emp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e1);
            out.writeObject(e1);
            out.close();
            fout.close();

            // Rest of your code...

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
