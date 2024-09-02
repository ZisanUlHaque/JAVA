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
public class Main {
    public static void main(String[] args) {
        // Create a Duck instance
        Duck duck = new Duck(2, "Female", "yellow");
        System.out.println("Duck Details:");
        System.out.println("Age: " + duck.getAge());
        System.out.println("Gender: " + duck.getGender());
        System.out.println("Beak Color: " + duck.getBeakColor());
        duck.swim();
        duck.quack();
        System.out.println("Is Mammal: " + duck.isMammal());
        duck.mate();
        System.out.println();

        // Create a Fish instance
        Fish fish = new Fish(1, "Male", 3, true);
        System.out.println("Fish Details:");
        System.out.println("Age: " + fish.getAge());
        System.out.println("Gender: " + fish.getGender());
        System.out.println("Size in Ft: " + fish.getSizeInFt());
        System.out.println("Can Eat: " + fish.canEat());
        fish.swim();
        System.out.println("Is Mammal: " + fish.isMammal());
        fish.mate();
        System.out.println();

        // Create a Zebra instance
        Zebra zebra = new Zebra(4, "Female", true);
        System.out.println("Zebra Details:");
        System.out.println("Age: " + zebra.getAge());
        System.out.println("Gender: " + zebra.getGender());
        System.out.println("Is Wild: " + zebra.isWild());
        System.out.println("Is Mammal: " + zebra.isMammal());
        zebra.mate();
    }
}
