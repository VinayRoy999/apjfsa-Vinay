package com.newapjfsa;

import java.util.ArrayList;
import java.util.Scanner;

public class FunGame {
    public static void main(String[] args) {
        // Game initialization
        GameLogic gameLogic = new GameLogic();
        gameLogic.startGame();
    }
}

class GameLogic {
    private Player player;
    private Scenario[] scenarios;
    private boolean loopActive;
    private int day;
    private Scanner scanner;
    
    public GameLogic() {
        this.scanner = new Scanner(System.in);
        this.loopActive = true;
        this.day = 1;
        initializeScenarios();
    }

    public void startGame() {
        System.out.println("Welcome to the Loop Game!");
        initializePlayer();
        gameLoop();
    }
    
    private void initializePlayer() {
        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();
        this.player = new Player(playerName);
        System.out.println("Hello, " + playerName + "! You find yourself trapped in a mysterious loop.");
    }

    private void gameLoop() {
        while (loopActive) {
            System.out.println("\n--- Day " + day + " ---");
            for (Scenario scenario : scenarios) {
                scenario.playScenario(player, scanner);
                if (scenario.isWinningScenario() && player.hasItem("Key")) {
                    System.out.println("Congratulations! You have found the way out of the loop!");
                    loopActive = false;
                    break;
                }
            }
            if (loopActive) {
                System.out.println("\nThe day resets... You wake up back where you started.");
                player.reset();
                day++;
            }
        }
        System.out.println("Thank you for playing!");
    }

    private void initializeScenarios() {
        // Define scenarios for the loop
        scenarios = new Scenario[]{
            new Scenario(
                "You wake up in a small room. There's a door with a keypad and a window.",
                new String[]{"Check the door", "Look out the window", "Go back to sleep"},
                new String[]{
                    "The door is locked and requires a code. Maybe you should look around for clues.",
                    "You see a garden outside. There's something shining near a tree.",
                    "You wake up again in the same room. It's the start of another day."
                },
                new String[]{null, "Note with a number '1234'", null},
                false
            ),
            new Scenario(
                "You enter a garden. There are paths leading in different directions.",
                new String[]{"Follow the path to the tree", "Go back inside", "Explore the garden"},
                new String[]{
                    "You find a shiny object near the tree. It's a key!",
                    "You return to the room.",
                    "You wander through the garden but find nothing of interest."
                },
                new String[]{"Key", null, null},
                false
            ),
            new Scenario(
                "You stand in front of a locked door. It seems you need a key or a code to open it.",
                new String[]{"Use the key", "Enter the code", "Leave the door"},
                new String[]{
                    "You use the key and the door unlocks. You step outside and see daylight!",
                    "You enter the code '1234' and the door unlocks. You step outside and see daylight!",
                    "You decide to explore more."
                },
                new String[]{null, null, null},
                true
            )
        };
    }
}

class Player {
    private String name;
    private ArrayList<String> inventory;
    
    public Player(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item) {
        if (item != null) {
            inventory.add(item);
        }
    }

    public boolean hasItem(String item) {
        return inventory.contains(item);
    }

    public void reset() {
        inventory.clear();
    }
}

class Scenario {
    private String description;
    private String[] choices;
    private String[] outcomes;
    private String[] rewards;
    private boolean winningScenario;
    
    public Scenario(String description, String[] choices, String[] outcomes, String[] rewards, boolean winningScenario) {
        this.description = description;
        this.choices = choices;
        this.outcomes = outcomes;
        this.rewards = rewards;
        this.winningScenario = winningScenario;
    }

    public boolean isWinningScenario() {
        return winningScenario;
    }

    public void playScenario(Player player, Scanner scanner) {
        System.out.println("\n" + description);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
        System.out.print("Choose an action: ");
        int choice = getChoice(scanner, choices.length);
        System.out.println(outcomes[choice - 1]);
        player.addItem(rewards[choice - 1]);
    }

    private int getChoice(Scanner scanner, int maxOption) {
        int choice = -1;
        while (choice < 1 || choice > maxOption) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number between 1 and " + maxOption + ": ");
            }
        }
        return choice;
    }
}
