import Utils.InputReader;

public class TaskTwo {

    public static void main(String[] args) {
        String str = getUserInput();

        String[] splittedString = splitString(str);
        String unfoldedString = getUnfoldString(splittedString);
        System.out.println(unfoldedString);

        char[] chars = toCharArray(str);
        char[] unfoldedChars = unfoldedChars(chars);
        String unfoldStr = new String(unfoldedChars);
        System.out.println(unfoldStr);
    }

    public static char[] toCharArray(String getUserInput) {
        return getUserInput.toCharArray();
    }

    public static char[] unfoldedChars(char[] chars) {
        char[] unfoldedCharsArray = new char[chars.length];
        int tempValue = chars.length-1;

        for (char aChar : chars) {
            unfoldedCharsArray[tempValue] = aChar;
            tempValue--;
        }
        return unfoldedCharsArray;
    }

    public static String getUnfoldString(String[] array) {
        String[] reverseStrIntoArray = new String[array.length];
        int tempValue = array.length-1;
        String delimiter = "";

        for (String s : array) {
            reverseStrIntoArray[tempValue] = s;
            tempValue--;
        }

        return String.join(delimiter, reverseStrIntoArray);
    }

    public static String[] splitString(String getUserInput) {
        return getUserInput.split("");
    }

    public static String getUserInput() {
        System.out.println("Hi! Enter any sentence and I will unfold it! But not only numbers ;)");
        String str = InputReader.readString();

        if (str.length() > 100 || str.length() <= 0) {
            System.out.println("Please enter more than 0 and less than 100 symbols");
            getUserInput();
        }

        return str;
    }
}
