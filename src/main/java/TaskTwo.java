import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        String str = inputString();
        String[] splittedString = splitString(str);
        String unfoldedString = getUnfoldString(splittedString);
        System.out.println(unfoldedString);
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
