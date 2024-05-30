import java.util.*;

public class Example 
{
    public static void main(String[] args) 
    {
        List <Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1,4);
        num.forEach(System.out::println);
        int n = num.get(0);
        System.out.println(n);
        boolean found = num.contains(4);
        System.out.println(found);
        int index = num.indexOf(3);
        num.remove(index);
        num.forEach(System.out::println);
    }    
}
