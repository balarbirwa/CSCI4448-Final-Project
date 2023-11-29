public class Person extends Profile {
    private Interests interests;

    // Default constructor
    public Person() {
        super(); // Calls the default constructor of Profile
        this.interests = new Interests("", "", "", "", "", "", "", "", "", "", "");
    }

    // Parameterized constructor
    public Person(int age, int height, String gender, String sign, String job, Interests interests) {
        super(age, height, gender, sign, job); // Calls the parameterized constructor of Profile
        this.interests = interests;
    }

    // Getter and setter for interests
    public Interests getInterests() {
        return interests;
    }

    public void setInterests(Interests interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "Person {" +
               "\n  Profile: " + super.toString() + // Calls toString of Profile class
               ",\n  Interests: " + interests.toString() + // Calls toString of Interests class
               "\n}";
    }
}
