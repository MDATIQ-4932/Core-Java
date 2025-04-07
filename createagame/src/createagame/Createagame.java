package createagame;

import java.util.Scanner;

public class Createagame {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");

        int guess = input.nextInt();

        if (guess == num) {
            System.out.println("win");
        } else {
            System.out.println("you are a looser");
        }
    }

}
