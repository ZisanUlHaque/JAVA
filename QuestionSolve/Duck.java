/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSolve;

/**
 *
 * @author ZISAN
 */
public class Duck extends Animal {
    // Attribute specific to Duck
    private String beakColor = "yellow";

    // Constructor
    public Duck(int age, String gender, String beakColor) {
        super(age, gender);  // Calling the superclass constructor
        this.beakColor = beakColor;
    }

    // Getter for beak color
    public String getBeakColor() {
        return beakColor;
    }

    // Duck-specific method for swimming
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    // Duck-specific method for quacking
    public void quack() {
        System.out.println("Duck says quack!");
    }

    @Override
    public boolean isMammal() {
        return false;  // Ducks are not mammals
    }

    @Override
    public void mate() {
        System.out.println("Duck is mating.");
    }
}

