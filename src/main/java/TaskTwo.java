import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        String str = inputString();

        String[] splittedString = splitString(str);
        String unfoldedString = getUnfoldString(splittedString);
        System.out.println(unfoldedString);

        char[] chars = toCharArray(str);
        char[] unfoldedChars = unfoldedChars(chars);
        String unfoldStr = new String(unfoldedChars);
//        String unfoldStr = String.valueOf(unfoldedChars);
        System.out.println(unfoldStr);
    }

    public static char[] toCharArray(String inputString) {
        return inputString.toCharArray();
    }

    public static char[] unfoldedChars(char[] chars) {
        char[] unfoldedCharsArray = new char[chars.length];
        int a = chars.length-1;

        for (char aChar : chars) {
            unfoldedCharsArray[a] = aChar;
            a--;
        }
        return unfoldedCharsArray;
    }

    public static String getUnfoldString(String[] array) {
        String[] reverseStrIntoArray = new String[array.length];
        int a = array.length-1;
        String delimiter = "";

        for (String s : array) {
            reverseStrIntoArray[a] = s;
            a--;
        }

        return String.join(delimiter, reverseStrIntoArray);
    }

    public static String[] splitString(String inputString) {
        return inputString.split("");
    }

    public static String inputString() {
        System.out.println("Hi! Enter any sentence and I will unfold it! But not only numbers ;)");
        String str = new Scanner(System.in).nextLine();

        if (str.length() > 100 || str.length() <= 0) {
            System.out.println("Please enter more than 0 and less than 100 symbols");
            inputString();
        }

        return str;
    }
}
