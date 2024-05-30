import java.util.*;
import java.io.*;
public class lab3_4 {
    public static void main(String[]args){
        ArrayList<String>a1=new ArrayList<String>();
        System.out.println("The intial size of a1:"+a1.size());
        a1.add("w");
        a1.add("e");
        a1.add("l");
        a1.add("c");
        a1.add(2,"ome");
        System.out.println("Size of a1 after additions: "+a1.size());
        System.out.println("The contents of list:"+a1);
        Collections.sort(a1);
        System.out.println("The contents of list after sorting:"+a1);
        a1.remove("c");
        a1.remove(2);
        System.out.println("Size of arraylist after deletions:"+a1.size());
        System.out.println("The contents of list "+a1);

    }
}
