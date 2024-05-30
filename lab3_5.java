import java.util.*;
import java.io.*;
public class lab3_5 {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();
        list.ensureCapacity(20);
        list.add("One");
        list.add("two");
        list.add("threee");
        list.add("four");
        list.trimToSize();
    }
}
