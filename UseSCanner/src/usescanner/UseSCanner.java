
package usescanner;

import java.util.Scanner;


public class UseSCanner {

   
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
   
   System.out.println("enter 1st number");
  int number1 =input.nextInt();
  System.out.println("enter 2nd number");
    int number2 =input.nextInt();
    
    int result = number1+number2;
    System.out.println("Result is "+result);  
    }    
}
