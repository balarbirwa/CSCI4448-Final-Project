import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Compatibility {

    public static List<Person> readPeopleFromFile(String filename) throws IOException {
        return Files.lines(Paths.get(filename))
            .map(line -> {
                String[] parts = line.split(",");
                // Assume that the order of fields in the file matches the constructor
                Interests interests = new Interests(parts[5], parts[6], parts[7], parts[8], parts[9], 
                                                    parts[10], parts[11], parts[12], parts[13], 
                                                    parts[14], parts[15]);
                return new Person(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), 
                                  parts[2], parts[3], parts[4], interests);
            })
            .collect(Collectors.toList());
    }

    public static void findCompatibility(String currentUserFile, String otherUsersFile) throws IOException {
        // Read the current user and other users
        Person currentUser = readPeopleFromFile(currentUserFile).get(0); // assumes single line for current user
        List<Person> otherUsers = readPeopleFromFile(otherUsersFile);

        // Calculate compatibility scores
        for (Person otherUser : otherUsers) {
            double compatibilityScore = currentUser.getInterests().calculateCompatibilityScore(otherUser.getInterests());
            System.out.printf("Compatibility with %s: %.2f%%\n", otherUser.getProfile().getJob(), compatibilityScore);
        }
    }
}
