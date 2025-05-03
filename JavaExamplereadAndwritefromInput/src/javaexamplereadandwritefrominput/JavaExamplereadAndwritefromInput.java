package javaexamplereadandwritefrominput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaExamplereadAndwritefromInput {

    public static void main(String[] args) throws FileNotFoundException {

            
        PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\text.txt");
        
        pw.print("wellcome to java" +"\n");
        pw.print("java is one of the most toughest language in the world");
            pw.close();

    }
}
