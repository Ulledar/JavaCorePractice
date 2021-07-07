package Utils;

import java.util.Scanner;

public class InputReader {

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double readDouble() {
        return  new Scanner(System.in).nextDouble();
    }

    public static String readString() {
        return new Scanner(System.in).nextLine();
    }
}
