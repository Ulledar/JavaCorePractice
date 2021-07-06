import Utils.InputReader;
import Utils.StringUtils;

public class TaskThree {

    public static void main(String[] args) {
        System.out.println("Write a word and I will check is it palindrome or not");
        String input = InputReader.readString();

        if (isPalindrome(input)) {
            System.out.println(input + " - palindrome!!!");
        } else {
            System.out.println(input + " - not a palindrome =(");
        }
    }

    public static boolean isPalindrome(String baseString) {
        String reversed = StringUtils.reverseString(baseString);
        return baseString.equals(reversed);
    }

}
