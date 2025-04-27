package make.evennumberusingforloof;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MakeEvenNumberUsingForLoof {

    public static void main(String[] args) throws FileNotFoundException {

       PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\even.txt");
        {

//         System.out.println("Even numbers from 1 to 50:");
            
           
            
            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
           

                   
                    pw.println(i);
                   
                }
            }
             pw.close();
        }
    }

}
