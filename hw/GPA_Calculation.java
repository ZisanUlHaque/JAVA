/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.util.Scanner;
public class GPA_Calculation {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Input the number
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        // Check the range and print the corresponding grade
        if (number >= 80 && number <= 100) {
            System.out.println("A+");
        } 
        else if (number >= 70 && number <= 79) {
            System.out.println("A");
        }
         else if (number >= 65 && number <= 69) {
            System.out.println("A-");
        }
         else if (number >= 60 && number <= 64) {
            System.out.println("B");
        }
        else if (number >= 50 && number <= 59) {
            System.out.println("C");
        }
        else if (number >= 33 && number <= 49) {
            System.out.println("D");
        }
        else if (number < 33) {
            System.out.println("Sorry!!");
        }  
        else {
            System.out.println("Invalid Result");
        }
        

        scanner.close();
    }
}
