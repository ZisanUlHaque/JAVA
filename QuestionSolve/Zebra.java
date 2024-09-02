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
public class Zebra extends Animal {
    // Attribute specific to Zebra
    private boolean isWild;

    // Constructor
    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);  // Calling the superclass constructor
        this.isWild = isWild;
    }

    // Getter for isWild
    public boolean isWild() {
        return isWild;
    }

    @Override
    public boolean isMammal() {
        return true;  // Zebras are mammals
    }

    @Override
    public void mate() {
        System.out.println("Zebra is mating.");
    }
}
