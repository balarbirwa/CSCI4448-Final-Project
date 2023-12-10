import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Compatibility {
    
    // Method to read a file and create Person objects
    public List<Person> readPeopleFromFile(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        List<Person> people = new ArrayList<>();

        for (String line : lines) {
            List<String> interests = List.of(line.split(","));
            people.add(new Person(interests));
        }

        return people;
    }

    // Method to calculate compatibility between two people
    public double calculateCompatibility(Person player, Person otherPerson) {
        List<String> playerInterests = player.getInterests();
        List<String> otherPersonInterests = otherPerson.getInterests();

        // Find the count of common interests
        long commonCount = playerInterests.stream()
                .filter(otherPersonInterests::contains)
                .count();

        // Calculate the percentage of compatibility
        double percentage = 100.0 * commonCount / playerInterests.size();

        return percentage;
    }

    // Method to find the most compatible person
    public Person findMostCompatiblePerson(Person player, List<Person> others) {
        Person mostCompatiblePerson = null;
        double highestCompatibility = 0;

        for (Person otherPerson : others) {
            double compatibility = calculateCompatibility(player, otherPerson);

            if (compatibility > highestCompatibility) {
                highestCompatibility = compatibility;
                mostCompatiblePerson = otherPerson;
            }
        }

        // Output the compatibility percentage to the console (or return it)
        System.out.println("Highest compatibility is: " + highestCompatibility + "%");

        return mostCompatiblePerson;
    }
}
