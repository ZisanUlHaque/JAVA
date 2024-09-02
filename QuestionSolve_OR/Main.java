/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionSolve_OR;

public class Main {
    public static void main(String[] args) {
        // Create a Team instance
        Team t = new Team();
        System.out.println("Team Details:");
        System.out.println("Name: " + t.name);
        System.out.println("City: " + t.city);
        System.out.println("Division: " + t.division);
        t.playGame();
        t.hireCoach();
        System.out.println();

        // Create a Player instance
        Player p = new Player();
        System.out.println("Player Details:");
        System.out.println("Name: " + p.name);
        System.out.println("Position: " + p.position);
        System.out.println("Jersey Number: " + p.jerseyNumber);
        p.playGame();
        p.train();
    }
}
