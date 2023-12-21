import java.util.*;
import Pokemon.*;
import Score.*;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Pokemon> pokemonList = new ArrayList<>();
    private static ArrayList<Pokemon> savedPokemon = new ArrayList<>();
    private static TopScore topScore = new TopScore();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("[1] Battle"
                            + "\n[2] View Top Scores"
                            + "\n[3] View Saved Pokemon"
                            + "\n[4] Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    Battle.startBattle(pokemonList, savedPokemon, topScore);
                    break;
                case 2:
                    viewTopScores();
                    break;
                case 3:
                    viewSavedPokemon();
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);
    }

    private static void viewTopScores() {
        System.out.println(topScore);
    }
    private static void viewSavedPokemon() {
        if (savedPokemon.isEmpty()) {
            System.out.println("No Pokemon in your saved list.");
        } else {
            System.out.println("Your saved Pokemon:");
            for (int i = 0; i < savedPokemon.size(); i++) {
                System.out.println((i + 1) + ". " + savedPokemon.get(i));
            }
        }
    }
}