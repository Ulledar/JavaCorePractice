import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Enter two numbers and you will get all even numbers between them");
        findEvenNumbers();
    }

    public static void findEvenNumbers() {
        int[] values = inputNumbers();

        for (int i = values[0]; i <= values[1]; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int[] inputNumbers() {
        int[] numbers = new int[2];

        Scanner firstInput = new Scanner(System.in);
        numbers[0] = firstInput.nextInt();

        Scanner secondInput = new Scanner(System.in);
        numbers[1] = secondInput.nextInt();

        return numbers;
    }
}
