
package hw;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("Enter the number to find prime number ");
        
        Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i=2;i<n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
