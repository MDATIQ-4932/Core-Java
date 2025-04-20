package factorialusingfoorloof;

import java.util.Scanner;

public class FactorialUsingFoorLoof {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");

        double input = s.nextInt();
        double factorial = 1;

        for (double i = 1; i <= input; i++) {

            factorial *= i;
        }
        System.out.println("factorial of " + input + " is " + factorial);
    }

}
