import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ANSI Color Codes
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";

        // Collecting user inputs for each interest field
        System.out.println(ANSI_CYAN + "Enter your creativity interest: " + ANSI_RESET);
        String creativity = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your sports interest: " + ANSI_RESET);
        String sports = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your food interest: " + ANSI_RESET);
        String food = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your hobby: " + ANSI_RESET);
        String hobby = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your music interest: " + ANSI_RESET);
        String music = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your favorite books: " + ANSI_RESET);
        String favoriteBooks = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your favorite movies: " + ANSI_RESET);
        String favoriteMovies = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your travel destinations: " + ANSI_RESET);
        String travelDestinations = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your personality traits: " + ANSI_RESET);
        String personalityTraits = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your hometown: " + ANSI_RESET);
        String hometown = scanner.nextLine();

        System.out.println(ANSI_CYAN + "Enter your job: " + ANSI_RESET);
        String job = scanner.nextLine();

        // Create an instance of Interests with the user input
        Interests myInterests = new Interests(creativity, sports, food, hobby, music, 
                                              favoriteBooks, favoriteMovies, travelDestinations, 
                                              personalityTraits, hometown, job);

        // Display the entered interests
        System.out.println(ANSI_YELLOW + "\nHere are your interests:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + myInterests + ANSI_RESET);

        // Display available traits
        List<Trait> allTraits = TraitList.getAllTraits();
        System.out.println(ANSI_YELLOW + "\nAvailable Traits:" + ANSI_RESET);
        for (Trait trait : allTraits) {
            System.out.println(ANSI_PURPLE + trait.getTraitName() + ANSI_RESET);
        }

        // Ask the user to select traits
        System.out.println(ANSI_BLUE + "\nEnter the traits you identify with (separated by commas): " + ANSI_RESET);
        String inputTraits = scanner.nextLine();
        String[] chosenTraitNames = inputTraits.split(",");

        // Display the chosen traits
        System.out.println(ANSI_YELLOW + "\nHere are your traits:" + ANSI_RESET);
        for (String traitName : chosenTraitNames) {
            traitName = traitName.trim();
            for (Trait trait : allTraits) {
                if (trait.getTraitName().equalsIgnoreCase(traitName)) {
                    System.out.println(ANSI_GREEN + trait + ANSI_RESET);
                    break;
                }
            }
        }

        scanner.close();
    }
}
