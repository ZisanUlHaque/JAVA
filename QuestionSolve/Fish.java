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
public class Fish extends Animal {
    // Attributes specific to Fish
    private int sizeInFt;
    private boolean canEat;

    // Constructor
    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);  // Calling the superclass constructor
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    // Getter methods
    public int getSizeInFt() {
        return sizeInFt;
    }

    public boolean canEat() {
        return canEat;
    }

    // Fish-specific method for swimming
    public void swim() {
        System.out.println("Fish is swimming.");
    }

    @Override
    public boolean isMammal() {
        return false;  // Fish are not mammals
    }

    @Override
    public void mate() {
        System.out.println("Fish is mating.");
    }
}
