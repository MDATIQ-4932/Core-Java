package using2darray;

import java.util.Arrays;
import java.util.Scanner;

public class Using2DArray {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
 int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}