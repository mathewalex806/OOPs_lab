import java.util.*;
import java.io.*;
import java.lang.*;
public class String_prgs {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));
        String s3 = "The quick brown fox jumped over the fence.";
        String s4 = s3.substring(4,6);
        System.out.println(s4);
    }
}
