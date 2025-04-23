
package biginteger;

import java.math.BigInteger;
import java.util.Scanner;


public class Biginteger {

    public static void main(String[] args) {
    
           Scanner  s = new Scanner(System.in);
           
        System.out.println("Enter a number");

       int n = s.nextInt(); 
        BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + " is:");
        System.out.println(factorial);
    }
}


        
        
      
    

