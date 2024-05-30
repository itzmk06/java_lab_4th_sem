import java.util.LinkedHashSet;
import java.util.Scanner;
public class lab4_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        String result=removeDuplicates(input);
        System.out.println("Resultant string after removing duplicates:"+result);
    }
    public static String removeDuplicates(String input){
        LinkedHashSet<Character>set=new LinkedHashSet<>();
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
