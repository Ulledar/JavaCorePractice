import Utils.InputReader;

public class TaskFour {

    public static void main(String[] args) {
        double inputHours = InputReader.readDouble();
        System.out.println(getSecondsFromHours(inputHours));
    }

    public static int getSecondsFromHours(double time) {
        String[] timeStringArray = String.valueOf(time).split("\\.");
        String[] decimals = timeStringArray[1].split("");
        int hoursInSeconds = Integer.parseInt(timeStringArray[0]) * 3600;
        int minutesInSeconds = Integer.parseInt(decimals[0]) * 360;

        if (decimals.length > 1) {
            minutesInSeconds = (Integer.parseInt(decimals[0]) * 360) + (Integer.parseInt(decimals[1]) * 36);
        }

        return hoursInSeconds + minutesInSeconds;
    }
}
