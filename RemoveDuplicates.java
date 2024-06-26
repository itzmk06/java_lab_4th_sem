import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            String result = removeDuplicates(input);
            System.out.println("String after removing duplicates: " + result);
        }
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(currentChar) < 0) {
                result += currentChar;
            }
        }
        return result;
    }
}
