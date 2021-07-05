import Utils.InputReader;

import java.util.ArrayList;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Enter two whole numbers and you will get all even numbers between them.");

        int[] inputNumbers = getInputNumbers();
        ArrayList<Integer> evenNumbers = findEvenNumbers(inputNumbers);
        printResultNumbers(evenNumbers);
    }

    public static ArrayList<Integer> findEvenNumbers(int[] values) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = values[0]; i <= values[1]; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    public static int[] getInputNumbers() {
        int[] numbers = new int[2];
        numbers[0] = InputReader.readInt();
        numbers[1] = InputReader.readInt();

        return numbers;
    }

    public static void printResultNumbers(ArrayList numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
