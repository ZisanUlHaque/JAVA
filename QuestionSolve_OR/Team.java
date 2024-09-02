
package QuestionSolve_OR;

public class Team {
    // Attributes
    String name;
    String city;
    String division;

    // Constructor
    Team( ) {
        name = "PUB Royals";
        city = "Bogura";
        division = "Rajshahi";
    }

    // Method to simulate playing a game
    public void playGame() {
        System.out.println(name + " from " + city + " is playing a game in the " + division + " division.");
    }

    // Method to hire a coach
    public void hireCoach() {
        System.out.println("A new coach has been hired for " + name + " from " + city + ".");
    }
}

