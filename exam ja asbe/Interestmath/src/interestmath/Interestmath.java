package interestmath;

import java.util.Scanner;

public class Interestmath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        double discount = 0;
        double finalPrice = price;

        if (price > 200) {
            discount = price * 0.05;
            finalPrice = price - discount;
        }

        System.out.println(price+"Discount amount: $" + (price*.05));
        System.out.println("Final price after discount: $" + (price-(price*.05)));

    
      
    }
}
