
package hw;
import java.util.Scanner;

public class LeapYear {
    public static void main(String args []){
        System.out.println("Enter the year: ");
        
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
                boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
    }
}
