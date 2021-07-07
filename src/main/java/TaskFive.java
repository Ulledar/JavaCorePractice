public class TaskFive {

    public static void main(String[] args) {
        boolean[] booleanArray = {false, true, false, false, true, false, true};
        System.out.println(getTrueCount(booleanArray));
    }

    public static int getTrueCount(boolean[] boolArray) {
        int trueCounter = 0;

        for (int i = 0; i < boolArray.length; i++) {
            if (boolArray[i]) {
                trueCounter++;
            }
        }

        return trueCounter;
    }
}
