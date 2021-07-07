import Utils.InputReader;

public class TaskFour {

    public static void main(String[] args) {
        int inputHours = InputReader.readInt();
        System.out.println(getSecondsFromHours(inputHours));
    }

    public static int getSecondsFromHours(int hours) {
        return hours * 3600;
    }

}
