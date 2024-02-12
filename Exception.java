import java.util.*;
import java.io.*;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        try
        {
            switch (a) {
                case 1:
                    throw new ArithmeticException();

                
                case 2:
                throw new ArrayIndexOutOfBoundsException();
            
                default:
                throw new FileNotFoundException();
           
                     }         
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception occured");
        }
        catch(ArrayIndexOutOfBoundsException ar)
        {
            System.out.println("Array Exception occured");
        }
        catch(FileNotFoundException ar)
        {
            System.out.println("File Exception occured");
        }
        sc.close();
        
        
    }
}
