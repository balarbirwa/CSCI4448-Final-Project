import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting user inputs for each interest field
        System.out.println("Enter your creativity interest: ");
        String creativity = scanner.nextLine();

        System.out.println("Enter your sports interest: ");
        String sports = scanner.nextLine();

        System.out.println("Enter your food interest: ");
        String food = scanner.nextLine();

        System.out.println("Enter your hobby: ");
        String hobby = scanner.nextLine();

        System.out.println("Enter your music interest: ");
        String music = scanner.nextLine();

        System.out.println("Enter your favorite books: ");
        String favoriteBooks = scanner.nextLine();

        System.out.println("Enter your favorite movies: ");
        String favoriteMovies = scanner.nextLine();

        System.out.println("Enter your travel destinations: ");
        String travelDestinations = scanner.nextLine();

        System.out.println("Enter your personality traits: ");
        String personalityTraits = scanner.nextLine();

        System.out.println("Enter your hometown: ");
        String hometown = scanner.nextLine();

        System.out.println("Enter your job: ");
        String job = scanner.nextLine();

        // Create an instance of Interests with the user input
        Interests myInterests = new Interests(creativity, sports, food, hobby, music, 
                                              favoriteBooks, favoriteMovies, travelDestinations, 
                                              personalityTraits, hometown, job);

        // Display the entered interests
        System.out.println("\nHere are your interests:");
        System.out.println(myInterests);

        // Display available traits
        List<Trait> allTraits = TraitList.getAllTraits();
        System.out.println("\nAvailable Traits:");
        for (Trait trait : allTraits) {
            System.out.println(trait.getTraitName());
        }

        // Ask the user to select traits
        System.out.println("\nEnter the traits you identify with (separated by commas): ");
        String inputTraits = scanner.nextLine();
        String[] chosenTraitNames = inputTraits.split(",");

        // Display the chosen traits
        System.out.println("\nHere are your traits:");
        for (String traitName : chosenTraitNames) {
            traitName = traitName.trim();
            for (Trait trait : allTraits) {
                if (trait.getTraitName().equalsIgnoreCase(traitName)) {
                    System.out.println(trait);
                    break;
                }
            }
        }

        scanner.close();
    }
}



