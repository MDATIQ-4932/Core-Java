
package printwritter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintWritter {

    
    public static void main(String[] args)throws FileNotFoundException {
      
       
        try(PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\New Text Document.txt")){
        
         
            pw.print(" well come to java" +"\n");
             pw.print(" java is one of the tougust language of the world");
        }    
    }   
}
