import java.util.*;
public class list {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        int sum[] = new int[number.size()];
        sum = number.toArray(sum);
        System.out.println(sum);
        System.out.println(sum);
    }
}
