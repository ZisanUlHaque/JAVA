
package hw;
import java.util.Scanner;
public class Seris {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i * i;
        }
  
        System.out.println("The sum of the series is: " + sum);
    }
}
