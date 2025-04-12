
package switchcasetofindmonth;

import java.util.Scanner;


public class Switchcasetofindmonth {

  
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.println(" enter A year");
        int year = s.nextInt();

        System.out.println(" enter Name of Month");
        int month = s.nextInt();
        String result = "";

        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "Septembar";
                break;
            case 10:
                result = "Octobar";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "Decembar";

                break;
            default:
                System.out.println("Out of Range");
        }

        System.out.println(" enter a date");
        String date = s.next();

        System.out.println(result + " " + date + "," + year);
    }

}  
        
    
    

