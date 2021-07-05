public class TaskTwo {

    public static void main(String[] args) {
        String str = "qwerty";
        String[] splittedString = splitString(str);
        String expandedString = getExpandString(splittedString);
        System.out.println(expandedString);
    }

    public static String getExpandString(String[] array) {
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
}
