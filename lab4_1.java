import java.util.Scanner;

public class lab4_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        String result=removeDuplicates(input);
        System.out.print("Resultant string after removing duplicates:"+result);
    }
    public static String removeDuplicates(String input){
        StringBuffer result=new StringBuffer();
        System.out.println(result);
        for(int i=0;i<input.length();i++){
            char currentChar=input.charAt(i);
            System.out.print(String.valueOf(currentChar));
            if (result.indexOf(String.valueOf(currentChar))==-1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
