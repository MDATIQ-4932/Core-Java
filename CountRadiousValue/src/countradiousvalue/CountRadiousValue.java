package countradiousvalue;

import java.util.Scanner;

public class CountRadiousValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter redious Value");

        float rediousValue = input.nextFloat();

        if (rediousValue <= 0) {
            System.err.println("0 Or Negative value cannot be redious Value");

            System.out.println("Enter positive redious Value");

            float positiveValue = input.nextFloat();

            if (positiveValue > 0) {
                System.out.println("The result :" + Math.PI * Math.pow(positiveValue, 2));
            }
        } else {
            System.out.println("The result: " + Math.PI * Math.pow(rediousValue, 2));
        }

    }

}
