
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a word");
        String inputWord = input.nextLine();
        StringBuilder sb = new StringBuilder(inputWord);
        String message = ((inputWord.equals(sb.reverse().toString())))? "The input string is a palindrome.": "The input string is not a palindrome.";
        System.out.println(message);
    }
    
}
