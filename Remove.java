import java .util.LinkedHashSet;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String input=s.nextLine();
        String  result=removeDuplicates(input);
        System.out.println("resultant string"+result);

    }

public static String removeDuplicates(String input){
    LinkedHashSet<Character> set=new LinkedHashSet<>();
    for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
        set.add(c);
    }
    StringBuffer sb=new StringBuffer();
    for(char c:set){
        sb.append(c);
    }
    return sb.toString();
}
}
