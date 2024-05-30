import java.util.*;
import java.io.*;
public class lab3_6 {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();
        list.add("Java");
        list.add("Enterprise java");
        list.add("jsp");
        list.add("java");
        list.add("servlets");
        list.add("java");
        list.add("struts");
        list.add("Machine Learning");
        System.out.println(list);
        System.out.println(list.lastIndexOf("java")); 

    }
}
