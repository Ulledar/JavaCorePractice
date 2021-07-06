import Utils.InputReader;
import Utils.UnfoldStrings;

public class TaskThree {

    public static void main(String[] args) {
        String input = InputReader.readString();
        char[] chars = UnfoldStrings.toCharArray(input);
        char[] unfoldedChars = UnfoldStrings.unfoldedChars(chars);
        String unfoldInput = UnfoldStrings.charToString(unfoldedChars);

        if (checkPolindrome(input, unfoldInput)) {
            System.out.println(input + " - полиндром!!!");
        } else {
            System.out.println(input + " - не полиндром =(");
        }
    }

    public static boolean checkPolindrome(String baseString, String unfoldString) {
        return baseString.equals(unfoldString);
    }

}
