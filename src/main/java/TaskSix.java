import Utils.InputReader;

import java.math.BigInteger;

public class TaskSix {

    public static void main(String[] args) {
        int number = InputReader.readInt();
        System.out.println(getFactorialLoop(number));
        System.out.println(getFactorial(number));
    }

    public static BigInteger getFactorial(int num) {
        if(num <= 1){
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(getFactorial(num-1));
        }
    }

    public static BigInteger getFactorialLoop(int num) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
