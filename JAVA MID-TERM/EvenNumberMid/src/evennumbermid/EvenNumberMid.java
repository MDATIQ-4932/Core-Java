
package evennumbermid;

import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import javax.print.event.PrintEvent;


public class EvenNumberMid {

   
    public static void main(String[] args) throws java.io.FileNotFoundException {
      
             try {
            
                 Scanner s = new Scanner(System.in);
            System.out.println("Enter a value");
            int number = s.nextInt();
                 PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\evene.txt");

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    pw.println(i);

                }
            }
            pw.close();

        }
             catch (java.io.FileNotFoundException ex) {
//            Logger.getLogger(FileClassTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
