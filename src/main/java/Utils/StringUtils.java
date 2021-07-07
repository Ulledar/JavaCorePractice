package Utils;

public class StringUtils {

    public static String reverseString(String s) {
        char[] chars = toCharArray(s);
        char[] unfoldedChars = getReversedCharArray(chars);

        return new String(unfoldedChars);
    }

    public static char[] toCharArray(String getUserInput) {
        return getUserInput.toCharArray();
    }

    public static char[] getReversedCharArray(char[] chars) {
        char[] unfoldedCharsArray = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            unfoldedCharsArray[chars.length-1-i] = chars[i];
        }

        return unfoldedCharsArray;
    }
}
