import java.util.*;
public class CountWords
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.trim().split(" ");
        System.out.println("Number of words in the String = "+words.length);
        sc.close();
    }    
}
