package recursionfebonaccinumber;

import java.util.Scanner;

public class RecursionFebonacciNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int index = input.nextInt();
        System.out.println("enter fibo number " + index + " is " + fib(index));
    }

    public static long fib(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
