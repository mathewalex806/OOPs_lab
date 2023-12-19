import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class Employee implements Serializable
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
                out.close();
                fout.close();

                Employee e2 = null;
                FileInputStream fin = new FileInputStream("emp.ser");
                ObjectInputStream oin = new ObjectInputStream(fin);
                e2 = (Employee)oin.readObject();
                System.out.println(e2.name);
                oin.close();
                fin.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
