/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_Solve;

public class Part2 {

    // Method to find the index of the first repeating element
    public int findFirstRepeatingIndex(int[] arr) {
        // Traverse the array with an outer loop
        for (int i = 0; i < arr.length; i++) {
            // For each element, check if it repeats later in the array
            for (int j = i + 1; j < arr.length; j++) {
                // If the element repeats, return the index of its first occurrence
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        // If no repeating element is found, return -1
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Part2 obj = new Part2();
        
        // Example array
        int[] arr = {10, 5,3, 4, 3,  6};
        
        // Call the method and print the result
        int result = obj.findFirstRepeatingIndex(arr);
        if (result != -1) {
            System.out.println("The index of the first repeating element is: " + result);
        } else {
            System.out.println("There are no repeating elements.");
        }
    }
}
