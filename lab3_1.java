import java.io.*;
import java.util.*;
public class lab3_1{
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);
        list.add(2,3);
        System.out.println(list);
    }
}