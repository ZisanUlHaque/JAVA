
package QuestionSolve_OR;

public class Player {
    // Attributes
    String name;
    String position;
    int jerseyNumber;

    // Constructor
    Player() {
        name = "Unknown";
        position = "Batsman & Captain";
        jerseyNumber = 03;
    }

    // Method to simulate playing a game
    public void playGame() {
        System.out.println(name + " (Jersey No. " + jerseyNumber + ") is playing as " + position + ".");
    }

    // Method to simulate training
    public void train() {
        System.out.println(name + " (Jersey No. " + jerseyNumber + ") is training to improve their skills.");
    }
}
