/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSolve;

public class Animal {
    // Attributes
    private int age;
    private String gender;

    // Constructor
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Getter methods
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Method to check if the animal is a mammal
    public boolean isMammal() {
        // This is a placeholder; actual implementation depends on the animal type
        return false;
    }

    // Method for animal mating behavior
    public void mate() {
        System.out.println("Animal is mating.");
    }
}


