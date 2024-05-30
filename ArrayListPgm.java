import java.util.*;
public class ArrayListPgm 
{
    public static void main(String[] args) 
    {
        ArrayList <String> a1= new ArrayList<String>();
        System.out.println("The initial size of a1 is "+a1.size());
        a1.add("W");
        a1.add("E");
        a1.add("L");
        a1.add("C");
        a1.add(2,"OME");
        System.out.println("Size of a1 after additions: "+a1.size());
        System.out.println("The contents of list: "+a1);
        Collections.sort(a1);
        System.out.println("The contents of list after sorting: "+a1);
        a1.remove("C");
        a1.remove(2);
        System.out.println("Size of Array List after deletions: "+a1.size());
        System.out.println("The contents of list: "+a1);    
    }    
}
