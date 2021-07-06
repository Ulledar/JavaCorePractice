package Utils;

public class UnfoldStrings {

    public static char[] toCharArray(String getUserInput) {
        return getUserInput.toCharArray();
    }

    public static char[] unfoldedChars(char[] chars) {
        char[] unfoldedCharsArray = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            unfoldedCharsArray[chars.length-1-i] = chars[i];
        }

        return unfoldedCharsArray;
    }

    public static String charToString(char[] c) {
        return new String(c);
    }
}
